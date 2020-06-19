package part04;

/**
 * Exercise 15:   (1) Create a class with a String that is initialized using 
 * instance initialization. 
 * @author kopan.dmytro
 *
 */
class Exercise15 {
	String st1; 
	{
		st1 = "Exercise15 text field";
	}

	public static void main(String[] args) {
		Exercise15 ex = new Exercise15();
		System.out.println(ex.st1);
	}
}
