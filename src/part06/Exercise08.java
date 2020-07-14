package part06;

/**
 * Exercise 8:   (1) Create a base class with only a non-default constructor, and 
 * a derived class with both a default (no-arg) and non-default constructor. In 
 * the derived-class constructors, call the base-class constructor. 
 * 
 * @author kopan.dmytro
 *
 */
class Exercise08Sub1{
	Exercise08Sub1(int i){
		
	}
}
class Exercise08 extends Exercise08Sub1 {

	Exercise08(int i){
		super(i);
	}
	public static void main(String[] args) {
		new Exercise08(8);
	}

}
