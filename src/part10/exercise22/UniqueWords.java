package part10.exercise22;

/**
 * Exercise 22:   (5) Modify the previous exercise so that it uses a class 
 * containing a String and a count field to store each different word, and 
 * a Set of these objects to maintain the list of words.
 * 
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
    List<String> wordList = new TextFile("SetOperations.java", "\\W+");
    for (String word : wordList) {
       	UniqueWordTool.put(word);
	}
    System.out.println(UniqueWordTool.library);
  }
} 

class UniqueWordTool {
	static Set<UniqueWordTool> library = new HashSet<>();
	String word;
	int count;
	
	private UniqueWordTool(String word) {
		this.word = word;
		this.count = 1; 
	}
	
	
	static void put(String word) {
		for (UniqueWordTool uniqueWordTool : library) {
			if (uniqueWordTool.getWord().equals(word)) {
				uniqueWordTool.setCount(uniqueWordTool.getCount()+1);
				return;
			}
		}
		library.add(new UniqueWordTool(word));
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "[word=" + word + ", count=" + count + "]";
	}
	
	
}
