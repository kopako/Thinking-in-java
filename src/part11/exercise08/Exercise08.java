package part11.exercise08;

import part11.exercise04.MyException;
/**
 * Exercise 8:   (1) Write a class with a method that throws an exception of the 
 * type created in Exercise 4. Try compiling it without an exception 
 * specification to see what the compiler says. Add the appropriate exception 
 * specification. Try out your class and its exception inside a try-catch clause.
 *  
 * @author kopan.dmytro
 *
 */
public class Exercise08 {
	
	static void method() throws MyException {
//		throw new MyException();
	}
	
	public static void main(String[] args) {
		try {
			method();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
