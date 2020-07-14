package part13.exercise08;

import java.util.Arrays;

/**
 * Exercise 8:   (5) Write a method that takes an object and recursively prints 
 * all the classes in that object’s hierarchy.
 * 
 * Exercise 9:   (5) Modify the previous exercise so that it uses 
 * Class.getDeclaredFields( ) to also display information about the fields in 
 * a class.
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise08 {

	public static void main(String[] args) throws ClassNotFoundException {
		method(Class.class);
	}
	static void method(Class cl) {
		System.out.println(cl.getSimpleName());
		System.out.println("\tFields: " + Arrays.toString(cl.getDeclaredFields()));
		
		if (cl.getSuperclass() != null) {
			method(cl.getSuperclass());
		}
	}
}
