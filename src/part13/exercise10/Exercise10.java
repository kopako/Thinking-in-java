package part13.exercise10;

/**
 * Exercise 10:   (3) Write a program to determine whether an array of char is 
 * a primitive type or a true Object.
 * @author kopan.dmytro
 *
 */
public class Exercise10 {

	public static void main(String[] args) {
		char[] arr = new char[5];
		
		System.out.println(arr.getClass().isPrimitive());
	}
}
