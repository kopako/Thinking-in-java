package part12.exercise16;

import java.io.File;
import java.util.*;
import java.util.regex.*;
import net.mindview.util.*;


/**
 * Exercise 16:   (5) Modify JGrep.java to accept a directory name or a file 
 * name as argument (if a directory is provided, search should include all 
 * files in the directory). Hint: You can generate a list of file names with:  
 * File[] files = new File(".").listFiles(); 
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
      System.out.println("javac Jgrep [OPTIONS] PATTERN FILE(or FOLDER)"
      		+ "OPTIONS:\n"
      		+ " -c\tcase insensitive\n"
      		+ " -m\tmultiline");
      System.exit(0);
    }
    
    String filename = args[args.length - 1];
    Pattern p;
    if (args.length <3) {
    	p = Pattern.compile(args[args.length - 2]);
    } else {
    	p = Pattern.compile(args[args.length - 2],getOption(args[0]));
    }
    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    if(new File(args[args.length - 1]).isFile()) {
	    search(filename, index, m);
    } else {
    	File[] files = new File(filename).listFiles();
    	for (File file : files) {
    		search(file.getAbsolutePath(), index, m);
		}
    }
  }
	
	private static void search(String filename, int index, Matcher m) {
		for(String line : new TextFile(filename)) {
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
