package part05;

/**
 * Exercise 6:   (1) Create a class with protected data. Create a second class 
 * in the same file with a method that manipulates the protected data in the 
 * first class.
 *   
 * @author kopan.dmytro
 *
 */
class Exercise06 {

	protected static String field;

}

class Exercise06SubClass {
	
	static void manipulateMethod() {
		Exercise06.field= "very bad approach";
	}
}
