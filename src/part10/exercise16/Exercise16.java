package part10.exercise16;

import java.util.*;

import net.mindview.util.TextFile;

/**
 * Exercise 16:   (5) Create a Set of the vowels. Working from UniqueWords.Java, 
 * count and display the number of vowels in each input word, and also display 
 * the total number of vowels in the input file. 
 * @author kopan.dmytro
 *
 */
public class Exercise16 {
	final static Set<Character> vowels = new HashSet<>();
	static long countGeneralVowels = 0;
	static {
		"aeouiy".chars()
		        .mapToObj(a -> new Character((char) a))
		        .forEach(a -> vowels.add(a));
	}
	
	public static void main(String[] args) {
		System.out.println(vowels);
		Set<String> words = new TreeSet<String>(new TextFile("UniqueWords.java", "\\W+"));
		for (String word : words) {
			countVowels(word);
		}
		System.out.println("total number of vowels in the input file: " 
				+ countGeneralVowels);
		
	}

	static void countVowels(String word) {
		System.out.println(word);
		word  = word.toLowerCase();
		for (Character ch : vowels) {
			long count = word.chars()
			    .filter(a -> ch.equals((char)a))
			    .count();
			if (count != 0) {
				System.out.printf("\t%s : %d\n", ch, count);
			}
		countGeneralVowels += count;
		}
	}
}
