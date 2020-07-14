package part12.exercise19;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/**
 * Exercise 19:   (8) Building on the previous two exercises, write a program 
 * that examines Java source code and produces all the class names used in a 
 * particular program. 
 * @author kopan.dmytro
 *
 */
public class Exercise19Failed {
	public static void main(String[] args) {
//		if(args.length < 1) {
//			System.out.println("Usage: provide the fileName to be scanned for comments");
//			System.exit(0);
//		}
		
//		String fileName = args[0];
		String fileName = "SetOperations.java";
		String content = TextFile.read(fileName);
		Map<String,Integer> allCapitalWords = new HashMap<>();
		Map<String,Integer> comments = new HashMap<>();
		Map<String,Integer> stringLiterals = new HashMap<>();
		Matcher mCapitalWords = Pattern.compile("(\\b[A-Z]\\w*)").matcher(content);
		Matcher mSingleStringComments = 
				Pattern.compile("(?<=((\\/{2,})))(\\b[A-Z]\\w*)").matcher(content);
		Matcher mComments = 
				Pattern.compile("((?<=(\\/\\*))(\\b[A-Z]\\w*)(?=(\\*\\/)))",Pattern.DOTALL).matcher(content);
		Matcher mStringLiteral = Pattern.compile("((?<=\\\")\\b[A-Z]\\w*(?=.*\\\"))").matcher(content);
		
		fillMap(mCapitalWords, allCapitalWords);
		fillMap(mComments, comments);
		fillMap(mSingleStringComments, comments);
		fillMap(mStringLiteral, stringLiterals);
		
		remove(allCapitalWords, comments);
		remove(allCapitalWords, stringLiterals);
		System.out.println(allCapitalWords);
		System.out.println(comments);
		System.out.println(stringLiterals);
		
	}

	private static void remove(Map<String, Integer> minuend, Map<String, Integer> subtrahend) {
		for (String key : minuend.keySet()) {
			if (subtrahend.containsKey(key) && subtrahend.get(key) > 0 && minuend.get(key) > 0) {
				minuend.put(key, minuend.get(key)-subtrahend.get(key));
				subtrahend.put(key, 0);
			}
		}
	}

	private static void fillMap(Matcher matcher, Map<String, Integer> map) {
		while(matcher.find()) {
			String matched = matcher.group();
			Integer frequencyOfKey = map.get(matched);
	      	map.put(matched, frequencyOfKey == null ? 1 : frequencyOfKey + 1);
		}
	}
}

