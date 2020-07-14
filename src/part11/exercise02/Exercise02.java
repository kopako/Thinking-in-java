package part11.exercise02;

/**
 * Exercise 2:   (1) Define an object reference and initialize it to null. Try to 
 * call a method through this reference. Now wrap the code in a try-catch clause 
 * to catch the exception.  
 * 
 * @author kopan.dmytro
 *
 */
class Exercise02 {
	void method() {
		System.out.println("method()");
	}
	
	public static void main(String[] args) {
		Exercise02 ex = null;
		
		try {
			ex.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
