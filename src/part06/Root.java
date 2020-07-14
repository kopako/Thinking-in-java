package part06;

/**
 * Exercise 9:   (2) Create a class called Root that contains an instance of each 
 * of the classes (that you also create) named Component1, Component2, and 
 * Component3. Derive a class Stem from Root that also contains an instance of 
 * each “component.” All classes should have default constructors that print a 
 * message about that class. 
 * 
 * Exercise 10:   (1) Modify the previous exercise so that each class only has 
 * non-default constructors.
 * 
 * Exercise 12:   (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9. 
 *  
 * @author kopan.dmytro
 *
 */
class Component1 {
	Component1(String arg){System.out.println("Constructor for Component1");}
	
	void dispose() {
		System.out.println("Erase Component1");
	}
}
class Component2 {
	Component2(String arg){System.out.println("Constructor for Component2");}

	void dispose() {
		System.out.println("Erase Component2");
	}
}
class Component3 {
	Component3(String arg){System.out.println("Constructor for Component3");}

	void dispose() {
		System.out.println("Erase Component3");
	}
}

class Root {
	
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Root(String arg){System.out.println("Constructor for Root");}

	void dispose () {
		System.out.println("Erase Root");
	}
	public static void main(String[] args) {
		new Stem("whatever");
	}
	
}

class Stem extends Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Stem(String arg){
		super(arg);
		System.out.println("Constructor for Stem"); 
	}
	
	void dispose() {
		super.dispose();
		System.out.println("Erase Stem");
	}
}
