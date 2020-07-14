package part09.exercise12;

/**
 * Exercise 12:   (1) Repeat Exercise 7 using an anonymous inner class. 
 * 
 * Exercise 7:   (2) Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and 
 * calls the outer-class method. In a second outer-class method, create an 
 * object of the inner class and call its method, then show the effect on the 
 * outer-class object.
 * @author kopan.dmytro
 *
 */
public class Exercise12 {

	public Inner inner() {
		return new Inner() {
			public void prolongCount(int secondsToProlong) {
				count += secondsToProlong;
			}
		};
	}
	
	private int count;
	
	public Exercise12(int count) {
		this.count = count;
	}

	private int countdown() {
		return count--;
	}
	
	void secondMethod() {
		this.inner().prolongCount(5);
		System.out.println("Second method"); System.out.println("count = " + count);
		countdown(); 
	}
	
	
	public static void main(String[] args) {
		Exercise12 ex = new Exercise12(10);

		ex.secondMethod();
		ex.secondMethod();
		ex.secondMethod();
		
	}
}
