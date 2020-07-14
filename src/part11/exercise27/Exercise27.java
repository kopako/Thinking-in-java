package part11.exercise27;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Exercise 27: (1) Modify Exercise 3 to convert the exception to a RuntimeException
 * @author kopan.dmytro
 *
 */
public class Exercise27 {

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
			logException(e);
			throw new RuntimeException(e);
		}
	}
}
