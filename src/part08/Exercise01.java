package part08;

/**
 * Exercise 1:   (1) Modify Exercise 9 in the previous chapter so that Rodent 
 * is an abstract class. Make the methods of Rodent abstract whenever possible. 
 * @author kopan.dmytro
 *
 */
public class Exercise01 {

}

abstract class Rodent {
	
	Rodent(){
		System.out.println("base class");
	}
	public abstract void hide();
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