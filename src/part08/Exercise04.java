package part08;


/**
 * Exercise 4:   (3) Create an abstract class with no methods. Derive a class 
 * and add a method. Create a static method that takes a reference to the base
 * class, downcasts it to the derived class, and calls the method. In main( ), 
 * demonstrate that it works. Now put the abstract declaration for the method 
 * in the base class, thus eliminating the need for the downcast.
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise04 extends Ex04Abastract {
	static void staticMethod(Ex04Abastract ab) {
//		((Exercise04) ab).method();
		ab.method();
	}
	
	void method() {
		System.out.println("methodz");
	}
	
	public static void main(String[] args) {
		Exercise04.staticMethod(new Exercise04());
	}
}

abstract class Ex04Abastract {
	
	abstract void method();
}