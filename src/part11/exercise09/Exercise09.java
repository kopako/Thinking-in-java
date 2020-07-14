package part11.exercise09;

/**
 * Exercise 9:   (2) Create three new types of exceptions. Write a class with 
 * a method that throws all three. In main( ), call the method but only use a 
 * single catch clause that will catch all three types of exceptions. 
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise09 {

	static void method() throws Exception1,Exception2,Exception3{
		
	}
	
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception {}