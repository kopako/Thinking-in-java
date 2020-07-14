package part12.exercise17;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

import net.mindview.util.TextFile;

/**
 * Exercise 17:   (8) Write a program that reads a Java source-code file (you 
 * provide the file name on the command line) and displays all the comments.
 * @author kopan.dmytro
 *
 */
class Exercise17 {

	public static void main(String[] args) throws IOException {
//		if(args.length < 1) {
//	      System.out.println("Usage: provide the fileName to be scanned for comments");
//	      System.exit(0);
//		}
		String fileName = "SetOperations.java";//args[0];
		//		Pattern comment = Pattern.compile("") 
		//		Files.readAllLines(Paths.get(fileName)).stream()

		List<Pattern> patterns = new ArrayList<>();
		patterns.add(Pattern.compile("(\\/{2,}.*)"));
		patterns.add(Pattern.compile("(\\/\\*.*\\*\\/)",Pattern.DOTALL));

		for (Pattern pattern : patterns) {

			int index = 0;
			Matcher m = pattern.matcher(TextFile.read(fileName)); 
			System.out.println(fileName + " comments: ");
			while(m.find())
				System.out.println(index++ + ": " + m.group());
		}
	}

}
