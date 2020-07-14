package part12.exercise10;

import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * Exercise 10:   (2) For the phrase "Java now has regular expressions" evaluate 
 * whether the following expressions will find a match: 
 * ^Java 
 * \Breg.* 
 * n.w\s+h(a|i)s 
 * s? 
 * s*+
 * s{4} 
 * S{1}. 
 * s{0,3}
 * @author kopan.dmytro
 *
 */
public class Exercise10 {
  public static void main(String[] args) {
	String s = "Java now has regular expressions";
	String[] patterns = {"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","S{1}.","s{0,3}"};
    
    print("Input: \"" + s + "\"");
    for(String arg : patterns) {
      print("Regular expression: \"" + arg + "\"");
      Pattern p = Pattern.compile(arg);
      Matcher m = p.matcher(s);
      while(m.find()) {
        print("\tMatch \"" + m.group() + "\" at positions " +
          m.start() + "-" + (m.end() - 1));
      }
    }
  }
} 