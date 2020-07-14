package part06;


/**
 * Exercise 16:   (2) Create a class called Amphibian. From this, inherit a 
 * class called Frog. Put appropriate methods in the base class. In main( ), 
 * create a Frog and upcast it to Amphibian and demonstrate that all the 
 * methods still work. 
 * 
 * Exercise 17:   (1) Modify Exercise 16 so that Frog overrides the method 
 * definitions from the base class (provides new definitions using the same 
 * method signatures). Note what happens in main( ). 
 * 
 * @author kopan.dmytro
 *
 */
class Exercise16 {

	public static void main(String[] args) {

		Amphibian a =  new Frog();
		a.swim();
		// If the method is overridden it will be executed, not the method from super
	}

}

class Amphibian {
	protected void swim() {
		System.out.println("Amphibian swims " + this.getClass().getName());
	}
	
}

class Frog extends Amphibian {

	@Override
	protected void swim() {
		System.out.println("Frog swims " + this.getClass().getName());
	}
	
	
	
}