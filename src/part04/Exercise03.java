package part04;

/**
 * Exercise 3:   (1) Create a class with a default 
 * constructor (one that takes no arguments) that prints a message. Create an object 
 * of this class.
 * Exercise 4:   (1) Add an overloaded constructor to the previous exercise that takes 
 * a String argument and prints it along with your message.
 * @author kopan.dmytro
 *
 */
class Exercise03 {
	public static void main(String[] args) {
		new Exercise03SubClass();
		new Exercise03SubClass("another one");
	}
}
class Exercise03SubClass {
	public Exercise03SubClass() {
		System.out.println("Message printed");
	}

	public Exercise03SubClass(String message) {
		this();
		System.out.println(message);
	}
}