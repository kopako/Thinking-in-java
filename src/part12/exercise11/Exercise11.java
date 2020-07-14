package part12.exercise11;

import static net.mindview.util.Print.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise 11:   (2) Apply the regular expression  
 * (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b  
 * to  
 * "Arline ate eight apples and one orange while Anita hadn’t any" 
 * @author kopan.dmytro
 *
 */
public class Exercise11 {

	public static void main(String[] args) {
		String reg = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		Pattern p = Pattern.compile(reg);
		String text = "Arline ate eight apples and one orange while Anita hadn’t any";
		Matcher m = p.matcher(text);
		System.out.printf("Regex: %s\n", reg);
		while(m.find()) {
	        print("\tMatch \"" + m.group() + "\" at positions " +
	          m.start() + "-" + (m.end() - 1));
	    }
		
	}
}
