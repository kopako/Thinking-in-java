package part08.exercise07;

/**
 * Exercise 7:   (1) Change Exercise 9 in the Polymorphism chapter so that Rodent 
 * is an interface. 
 * 
 * @author kopan.dmytro
 *
 */


//Was moved into package because of name conflict in Exercise01
public class Exercise07 {
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

interface Rodent {
	
	public abstract void hide();
	public default void survive() {
		System.out.println("survive method " + this.getClass().getSimpleName());
		hide();
	}
}

class Mouse implements Rodent {

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

class Gerbil implements Rodent {
	
	Gerbil(){
		System.out.println("derived class");
	}
	
	@Override
	public void hide() {
		System.out.println("hide in the field");
	}
}

class Hamster implements Rodent {
	
	Hamster() {
		System.out.println("derived class");
	}
	@Override
	public void hide() {
		System.out.println("hide in the house");
	}
}