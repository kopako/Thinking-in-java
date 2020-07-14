package part11.exercise06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Exercise 6:   (1) Create two exception classes, each of which performs its 
 * own logging automatically. Demonstrate that these work. 
 * @author kopan.dmytro
 *
 */
class Exercise06 {
	static void method1() throws MyException1{
		throw new MyException1();
	}
	static void method2() throws MyException1{
		throw new MyException1();
	}
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {}
		try {
			method2();
		} catch(Exception e) {}
	}
}


class MyException1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public MyException1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString()); 		
	}
}

class MyException2 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public MyException2() {
	StringWriter trace = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
	} 
}

