package part11.exercise03;

import java.io.*;
import java.util.logging.Logger;

/**
 * Exercise 7:   (1) Modify Exercise 3 so that the catch clause logs the results.
 * 
 * Exercise 3: (1) Write code to generate and catch an
 * ArraylndexOutOfBoundsException.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise03 {
	
	private static Logger logger = Logger.getLogger("LoggingExercise03");

	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			logException(e);
		}
	}

}
