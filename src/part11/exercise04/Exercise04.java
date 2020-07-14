package part11.exercise04;

/**
 * Exercise 4:   (2) Create your own exception class using the extends keyword. 
 * Write a constructor for this class that takes a String argument and stores it 
 * inside the object with a String reference. Write a method that displays the 
 * stored String. Create a try-catch clause to exercise your new exception.  
 * 
 * @author kopan.dmytro
 *
 */
class Exercise04 {

	public static void main(String[] args) {
		try {
			MyException myException = new MyException("Exception message");
			myException.printMsg();
			throw myException;
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}

