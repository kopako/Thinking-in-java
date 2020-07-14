package part10.exercise10;

import java.util.*;

/**
 * Exercise 10:   (2) Change Exercise 9 in the Polymorphism chapter to use an 
 * ArrayList to hold the Rodents and an Iterator to move through the sequence 
 * of Rodents. 
 * 
 * Exercise 9:   (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil,
 * Hamster, etc. In the base class, provide methods that are common to all
 * Rodents, and override these in the derived classes to perform different 
 * behaviors depending on the specific type of Rodent. Create an array of Rodent, 
 * fill it with different specific types of Rodents, and call your base-class 
 * methods to see what happens. 
 * 
 * @author kopan.dmytro
 *
 */
class Exercise09 {

	public static void main(String[] args) {
		List<Rodent> rodents = new ArrayList<>();
			rodents.add(new Mouse());
			rodents.add(new Gerbil());
			rodents.add(new Hamster());
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
