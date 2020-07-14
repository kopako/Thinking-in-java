package part06;


/**
 * Exercise 19:   (2) Create a class with a blank final reference to an object. 
 * Perform the initialization of the blank final inside all constructors. 
 * Demonstrate the guarantee that the final must be initialized before use, 
 * and that it cannot be changed once initialized.
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise19 {
	private final String field1;

	public Exercise19() {
		this.field1 = "whatever";
	}

	public Exercise19(String field1) {
		super();
		this.field1 = field1;
	}
	
	public static void main(String[] args) {
		new Exercise19();
	}	
}
