package part11.exercise01;

/**
 * Exercise 1:   (2) Create a class with a main( ) that throws an object of class 
 * Exception inside a try block. Give the constructor for Exception a String 
 * argument. Catch the exception inside a catch clause and print the String 
 * argument. Add a finally clause and print a message to prove you were there.  
 * 
 * @author kopan.dmytro
 *
 */
class Exercise01 {
	public static void main(String[] args) {
		try {
			throw new Exception("Throwing an exception");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Still executting");
		}
	}
}
