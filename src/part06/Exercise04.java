package part06;


/**
 * Exercise 4:   (2) Prove that the base-class constructors are (a) always called 
 * and (b) called before derived-class constructors.  
 * 
 * @author kopan.dmytro
 *
 */
class Exercise04 extends Exercise04SubClass{

	public static void main(String[] args) {
		// Implicit super constructor A() is not visible for default constructor. Must define an explicit constructor
		new Exercise04();
	}

}

class Exercise04SubClass{
	private Exercise04SubClass() {
		System.out.println("private constructor of A");
	}
}