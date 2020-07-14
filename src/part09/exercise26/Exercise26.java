package part09.exercise26;

/**
 * Exercise 26:   (2) Create a class with an inner class that has a non-default 
 * constructor (one that takes arguments). Create a second class with an inner 
 * class that inherits from the first inner class.
 * @author kopan.dmytro
 *
 */
class Exercise26 {
	class Inner{

		public Inner(String s) {
			super();
			// TODO Auto-generated constructor stub
		}
	}
}

class Ex26Child extends Exercise26.Inner {

	public Ex26Child(Exercise26 ex, String s) {
		ex.super(s);
	}
	
}