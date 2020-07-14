package part09.exercise05;

/**
 * Exercise 5:   (1) Create a class with an inner class. 
 * In a separate class, make an instance of the inner class. 
 * @author kopan.dmytro
 *
 */
class Exercise05 {

	class Inner {
		
	}
}

class Main {
	public Main() {
		Exercise05.Inner in = new Exercise05().new Inner();
	}
}
