package part08;


/**
 * Exercise 3:   (2) Create a base class with an abstract print( ) method that 
 * is overridden in a derived class. The overridden version of the method 
 * prints the value of an int variable defined in the derived class. At the 
 * point of definition of this variable, give it a nonzero value. In the 
 * base-class constructor, call this method. In main( ), create an object 
 * of the derived type, and then call its print( ) method. Explain the results. 
 * @author kopan.dmytro
 *
 */
abstract class Exercise03 { 
	// a good guideline for constructors is, “Do as little 
	//as possible to set the object into a good state, and 
	//if you can possibly avoid it, don’t call any other 
	//methods in this class.”
	Exercise03(){
		print();
	}
	
	abstract void print();
	
	public static void main(String[] args) {
		Exercise03 ex = new Ex03Derived();
		//Output: 0
		// we print arg after it was allocated but before it was initialized;
	}

}

class Ex03Derived extends Exercise03 {
	int arg = 1;
	@Override
	void print() {
		System.out.println(arg);
	}
	
}