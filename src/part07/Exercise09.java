package part07;

/**

 * Exercise 9:   (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil,
 * Hamster, etc. In the base class, provide methods that are common to all
 * Rodents, and override these in the derived classes to perform different 
 * behaviors depending on the specific type of Rodent. Create an array of Rodent, 
 * fill it with different specific types of Rodents, and call your base-class 
 * methods to see what happens. 
 * 
 * Exercise 10:   (3) Create a base class with two methods. In the first method,
 * call the second method. Inherit a class and override the second method. 
 * Create an object of the derived class, upcast it to the base type, and call 
 * the first method. Explain what happens.
 * 
 * Exercise 12:   (3) Modify Exercise 9 so that it demonstrates the order of 
 * initialization of the base classes and derived classes. Now add member objects 
 * to both the base and derived classes and show the order in which their 
 * initialization occurs during construction. 
 *  
 *  Exercise 14:   (4) Modify Exercise 12 so that one of the member objects is 
 *  a shared object with reference counting, and demonstrate that it works properly. 
 *  
 * @author kopan.dmytro
 *
 */
public class Exercise09 {

	public static void main(String[] args) {
		Rodent[] rodents = { new Mouse(),new Gerbil(), new Hamster() };
		new Mouse();
		new Mouse();
		new Mouse();
		
		for (Rodent rodent : rodents) {
			rodent.hide();
			rodent.survive();
		}
	}
}

class Rodent {
	
	Rodent(){
		System.out.println("base class");
	}
	public void hide() {
		System.out.println("hide");
	}
	
	public void survive() {
		System.out.println("survive method");
		hide();
	}
}

class Mouse extends Rodent {

	private static int counter=0;
	{
		counter+=1;
	}
	Mouse() {
		System.out.println("derived class " + counter);
	}
	@Override
	public void hide() {
		System.out.println("hide in the house");
	}
}

class Gerbil extends Rodent {
	
	Gerbil(){
		System.out.println("derived class");
	}
	
	@Override
	public void hide() {
		System.out.println("hide in the field");
	}
}

class Hamster extends Rodent {
	
	Hamster() {
		System.out.println("derived class");
	}
	@Override
	public void hide() {
		System.out.println("hide in the house");
	}
}
