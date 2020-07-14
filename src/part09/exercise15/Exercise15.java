package part09.exercise15;

/**
 * Exercise 15:   (2) Create a class with a non-default constructor (one with 
 * arguments) and no default constructor (no "no-arg" constructor). Create a 
 * second class that has a method that returns a reference to an object of the 
 * first class. Create the object that you return by making an anonymous inner 
 * class that inherits from the first class. 
 * @author kopan.dmytro
 *
 */
class Exercise15 {
	Exercise15(int i){
		
	}
}

abstract class AbstractClass extends Exercise15 {

	AbstractClass(int i) {
		super(i);
		System.out.println("abstract class constructor");
	}
}

class SecondClass {
	Exercise15 getEx(final int i) {
		return new AbstractClass(i) {};
	}
}
