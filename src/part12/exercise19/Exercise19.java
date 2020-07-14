package part12.exercise19;

import java.util.*;
import java.util.function.Function;
import java.util.regex.*;
import java.util.stream.Collectors;

import net.mindview.util.TextFile;

/**
 * Exercise 19:   (8) Building on the previous two exercises, write a program 
 * that examines Java source code and produces all the class names used in a 
 * particular program. 
 * @author kopan.dmytro
 *
 */
public class Exercise19 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: provide the fileName to be scanned for comments");
			System.exit(0);
		}
//		String fileName = "SetOperations.java"; //testing reason

		String fileName = args[0];
		String content = TextFile.read(fileName);
		Map<String,Long> allCapitalWords = new HashMap<>();
		List<String> comments = new ArrayList<>();
		List<String> stringLiterals = new ArrayList<>();
		Matcher mCapitalWords = Pattern.compile("(\\b[A-Z]\\w*)").matcher(content);
		Matcher mSingleStringComments = 
				Pattern.compile("(?<=((\\/{2,})))(.*)").matcher(content);
		Matcher mComments = 
				Pattern.compile("((?<=(\\/\\*))(.*)(?=(\\*\\/)))",Pattern.DOTALL).matcher(content);
		Matcher mStringLiteral = Pattern.compile("\\\".*?\\\"").matcher(content);

		fill(mCapitalWords, allCapitalWords);
		fill(mComments, comments);
		fill(mSingleStringComments, comments);
		fill(mStringLiteral, stringLiterals);
		
		Map<String, Long> commentsMap = comments.stream()
			.flatMap(Pattern.compile("\\W")::splitAsStream)
			.filter(Pattern.compile("[A-Z]\\w*").asPredicate())
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> stringLiteralsMap = stringLiterals.stream()
		.map(a-> a.replaceAll("^\"|\"$", ""))
		.flatMap(Pattern.compile("\\W")::splitAsStream)
		.filter(Pattern.compile("[A-Z]\\w*").asPredicate())
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		remove(allCapitalWords, commentsMap);
		remove(allCapitalWords, stringLiteralsMap);
		
		System.out.println("---------comments:\n" + commentsMap);
		System.out.println("---------string literals:\n" + stringLiteralsMap);
		System.out.println("---------all capital words:\n" + allCapitalWords);
		
		List<String> classes = allCapitalWords.entrySet().stream()
				  .filter(e -> e.getValue() != 0L)
				  .map(Map.Entry::getKey)
				  .collect(Collectors.toList());

		System.out.println("\nClasses:\n"+ classes);
	}
	
	private static void fill(Matcher matcher, Map<String, Long> map) {
		while(matcher.find()) {
			String matched = matcher.group();
			Long frequencyOfKey = map.get(matched);
	      	map.put(matched, frequencyOfKey == null ? 1 : frequencyOfKey + 1);
		}
	}
	private static void fill(Matcher matcher, List<String> list) {
		while(matcher.find()) {
			list.add(matcher.group());
		}
	}
	private static void remove(Map<String, Long> minuend, Map<String, Long> subtrahed) {
		for (String key : minuend.keySet()) {
			if (subtrahed.containsKey(key) && subtrahed.get(key) > 0 && minuend.get(key) > 0) {
				minuend.put(key, (minuend.get(key)-subtrahed.get(key)));
				subtrahed.put(key, (long) 0);
			}
		}
	}
}
