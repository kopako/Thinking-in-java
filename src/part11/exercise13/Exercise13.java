package part11.exercise13;

/**
 * Exercise 13:   (2) Modify Exercise 9 by adding a finally clause. Verify 
 * that your finally clause is executed, even if a NullPointerException 
 * is thrown.
 * 
 * Exercise 9:   (2) Create three new types of exceptions. Write a class with 
 * a method that throws all three. In main( ), call the method but only use a 
 * single catch clause that will catch all three types of exceptions. 
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise13 {

	static void method() throws Exception1,Exception2,Exception3{
//		throw new Exception1();
	}
	
	public static void main(String[] args) {
		try {
			method();
			throw new NullPointerException();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
	}
}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception {}