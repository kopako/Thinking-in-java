package part11.exercise26;

import java.io.*;

/**
 * Exercise 26: (1) Change the file name string in MainException.java to name a 
 * file that doesn’t exist. Run the program and note the result. 
 * @author kopan.dmytro
 *
 */
public class Exercise26 {
	 // Pass all exceptions to the console:
	  public static void main(String[] args) throws Exception {
	    // Open the file:
	    FileInputStream file =
	      new FileInputStream("MainExce.java");
	    // Use the file ...
	    // Close the file:
	    file.close();
	  }
}
