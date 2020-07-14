package part12.exercise15;

import java.util.*;
import java.util.regex.*;
import net.mindview.util.*;


/**
 * Exercise 15:   (5) Modify JGrep.java to accept flags as arguments 
 * (e.g., Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
 * @author kopan.dmytro
 *
 */
class JGrep {

	private static Map<String,Integer> options = new HashMap<>();
	static {
		options.put("-c", Pattern.CASE_INSENSITIVE);
		options.put("-m", Pattern.MULTILINE);
	}

  public static void main(String[] args) throws Exception {
    if(args.length < 2) {
      System.out.println("Usage: java JGrep file regex");
      System.out.println("javac Jgrep [OPTIONS] PATTERN FILE"
      		+ "OPTIONS:\n"
      		+ " -c\tcase insensitive\n"
      		+ " -m\tmultiline");
      System.exit(0);
    }
    Pattern p;
    if (args.length <3) {
    	p = Pattern.compile(args[args.length - 2]);
    } else {
    	p = Pattern.compile(args[args.length - 2],getOption(args[0]));
    }
    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    for(String line : new TextFile(args[args.length - 1])) {
      m.reset(line);
      while(m.find())
        System.out.println(index++ + ": " +
          m.group() + ": " + m.start());
    }
  }
  
  static Integer getOption(String key) {
	  if (!options.containsKey(key)) throw new NoSuchOption();
	  return options.get(key);
  }
} 

class NoSuchOption extends NoSuchElementException {
	
}
/* Output: (Sample)
0: strings: 4
1: simple: 10
2: the: 28
3: Ssct: 26
4: class: 7
5: static: 9
6: String: 26
7: throws: 41
8: System: 6
9: System: 6
10: compile: 24
11: through: 15
12: the: 23
13: the: 36
14: String: 8
15: System: 8
16: start: 31
*///:~
