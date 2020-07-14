package part09.exercise20;

/**
 * Exercise 20:   (1) Create an interface containing a nested class. 
 * Implement this interface and create an instance of the nested class.
 * @author kopan.dmytro
 *
 */
public interface Exercise20 {
	class Nested {
		
	}

}

class Exercise20Impl implements Exercise20{
	public static void main(String[] args) {
		new Nested();
	}
}