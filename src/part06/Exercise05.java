package part06;


/**
 * Exercise 5:   (1) Create two classes, A and B, with default constructors 
 * (empty argument lists) that announce themselves. Inherit a new class called C 
 * from A, and create a member of class B inside C. Do not create a constructor 
 * for C. Create an object of class C and observe the results. 
 *
 * Exercise 7:   (1) Modify Exercise 5 so that A and B have constructors with 
 * arguments instead of default constructors. Write a constructor for C and 
 * perform all initialization within C’s constructor.
 *  
 * @author kopan.dmytro
 *
 */
public class Exercise05 {

	public static void main(String[] args) {
		new C("whatever");
//
//		A default constructor
//		B default constructor
//		C default constructor

	}

}

class A{
	A(String arg){
		System.out.println("A default constructor");
	}
}

class B{
	B(String arg){
		System.out.println("B default constructor");
	}
}

class C extends A{
	private B b = new B("whatev");
	
	C(String arg){
		super(arg);
		System.out.println("C default constructor");
	}
}