package part12.exercise18;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/**
 * Exercise 18:   (8) Write a program that reads a Java source-code file (you 
 * provide the file name on the command line) and displays all the string 
 * literals in the code. 
 * @author kopan.dmytro
 *
 */
public class Exercise18 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: provide the fileName to be scanned for comments");
			System.exit(0);
		}
		
		String fileName = args[0];

		Pattern pattern = Pattern.compile("\".+?\"");
		int index = 0;
		Matcher m = pattern.matcher(TextFile.read(fileName)); 
		System.out.println(fileName + " comments: ");
		while(m.find())
			System.out.println(index++ + ": " + m.group());
	}

}
