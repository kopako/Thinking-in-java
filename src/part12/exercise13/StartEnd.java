package part12.exercise13;


import java.util.regex.*;

import part12.exercise12.Groups;

import static net.mindview.util.Print.*;

/**
 * Exercise 13:   (2) Modify StartEnd.java so that it uses Groups.POEM as input,
 * but still produces positive outputs for find( ), lookingAt( ) and matches( ).
 * @author kopan.dmytro
 *
 */
public class StartEnd {
  public static String input = Groups.POEM;
//    "As long as there is injustice, whenever a\n" +
//    "Targathian baby cries out, wherever a distress\n" +
//    "signal sounds among the stars ... We'll be there.\n" +
//    "This fine ship, and this fine crew ...\n" +
//    "Never give up! Never surrender!";
  private static class Display {
    private boolean regexPrinted = false;
    private String regex;
    Display(String regex) { this.regex = regex; }
    void display(String message) {
      if(!regexPrinted) {
        print("  " + regex);
        regexPrinted = true;
      }
      print(message);
    }
  }
  static void examine(String s, String regex) {
    Display d = new Display(regex);
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    while(m.find())
      d.display("    find() '" + m.group() +
        "' start = "+ m.start() + " end = " + m.end());
    if(m.lookingAt()) // No reset() necessary
      d.display("      lookingAt() start = "
        + m.start() + " end = " + m.end());
    if(m.matches()) // No reset() necessary
      d.display("matches() start = "
        + m.start() + " end = " + m.end());
  }
  public static void main(String[] args) {
    for(String in : input.split("\n")) {
      print("input : " + in);
      for(String regex : new String[]{"\\w*ere\\w*",
        "\\w*ever", "T\\w+", "Never.*?!"})
        examine(in, regex);
    }
  }
}