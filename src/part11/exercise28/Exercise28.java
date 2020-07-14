package part11.exercise28;

import part11.exercise28.*;

/**
 * Exercise 28: (1) Modify Exercise 4 so that the custom exception class 
 * inherits from RuntimeException, and show that the compiler allows you 
 * to leave out the try block. 
 * @author kopan.dmytro
 *
 */
public class Exercise28 {

	public static void main(String[] args) {
//		try {
			MyException28 myException = new MyException28("Exception message");
			myException.printMsg();
			throw myException;
//		} catch (MyException28 e) {
//			e.printStackTrace();
//		}
	}
}
