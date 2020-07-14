package part12.exercise12;


import java.util.*;
import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * Exercise 12:   (5) Modify Groups.java to count all of the unique words that 
 * do not start with a capital letter. 
 * @author kopan.dmytro
 *
 */
public class Groups {
  static public final String POEM =
    "Twas brillig, and the slithy toves\n" +
    "Did gyre and gimble in the wabe.\n" +
    "All mimsy were the borogoves,\n" +
    "And the mome raths outgrabe.\n\n" +
    "Beware the Jabberwock, my son,\n" +
    "The jaws that bite, the claws that catch.\n" +
    "Beware the Jubjub bird, and shun\n" +
    "The frumious Bandersnatch.";
  public static void main(String[] args) {
    Matcher m =
      Pattern.compile("\\b[a-z]+")
        .matcher(POEM);
    Map<String,Integer> uniqueWordsCount = new HashMap<>();
    while(m.find()) {
      for(int j = 0; j <= m.groupCount(); j++) {
    	  String group = m.group(j);
      	Integer freq = uniqueWordsCount.get(group); 
      	uniqueWordsCount.put(group, freq == null ? 1 : freq + 1);
      }
    }
    System.out.println(uniqueWordsCount);
  }
}
