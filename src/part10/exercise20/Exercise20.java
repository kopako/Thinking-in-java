package part10.exercise20;

import java.util.*;

import net.mindview.util.TextFile;

/**
 * Exercise 20:   (3) Modify Exercise 16 so that you keep a count of the 
 * occurrence of each vowel. 
 * 
 * Exercise 16:   (5) Create a Set of the vowels. Working from UniqueWords.Java, 
 * count and display the number of vowels in each input word, and also display 
 * the total number of vowels in the input file. 
 * @author kopan.dmytro
 *
 */
public class Exercise20  {
	final static Map<Character, Long> vowels = new HashMap<>();
	static long countGeneralVowels = 0;
	static {
		"aeouiy".chars()
		        .mapToObj(a -> new Character((char) a))
		        .forEach(a -> vowels.put(a,0L));
	}
	
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(new TextFile("UniqueWords.java", "\\W+"));
		for (String word : words) {
			countVowels(word);
		}
		System.out.println(vowels);
		System.out.println("total number of vowels in the input file: " 
				+ countGeneralVowels);
		
	}

	static void countVowels(String word) {
		System.out.println(word);
		word  = word.toLowerCase();
		for (Character ch : vowels.keySet()) {
			long count = word.chars()
			    .filter(a -> ch.equals((char)a))
			    .count();
			if (count != 0) {
				vowels.put(ch, vowels.get(ch)+count);
				System.out.printf("\t%s : %d\n", ch, count);
			}
		countGeneralVowels += count;
		}
	}
}
