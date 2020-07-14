package part10.exercise21;

/**
 * Exercise 21:   (3) Using a Map<String,Integer>, follow the form of 
 * UniqueWords.java to create a program that counts the occurrence of 
 * words in a file. Sort the results using Collections.sort( ) with a 
 * second argument of String.CASE_INSENSITIVE_ORDER (to produce an alphabetic 
 * sort), and display the result.
 */
import java.util.*;
import net.mindview.util.*;

class UniqueWords {
  public static void main(String[] args) {
    Map<String, Integer> wordMap = new LinkedHashMap<>();
    List<String> wordList = new TextFile("SetOperations.java", "\\W+");
    Collections.sort(wordList, String.CASE_INSENSITIVE_ORDER);
    for (String word : wordList) {
    	Integer freq = wordMap.get(word); 
    	wordMap.put(word, freq == null ? 1 : freq + 1);
	}
    System.out.println(wordMap);
  }
} 
