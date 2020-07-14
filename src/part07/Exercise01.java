package part07;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 1:   (2) Create a Cycle class, with subclasses Unicycle, Bicycle and 
 * Tricycle. Demonstrate that an instance of each type can be upcast to Cycle 
 * via a ride( ) method. 
 * 
 * Exercise 5:   (1) Starting from Exercise 1, add a wheels( ) method in Cycle, 
 * which returns the number of wheels. Modify ride( ) to call wheels( ) and 
 * verify that polymorphism works. 
 * 
 * Exercise 17:   (2) Using the Cycle hierarchy from Exercise 1, 
 * add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
 * Create instances of all three types and upcast them to an array of Cycle. 
 * Try to call balance( ) on each element of the array and observe the results. 
 * Downcast and call balance( ) and observe what happens
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise01 {
	public static void main(String[] args) {
	
		List<Cycle> cycles = new ArrayList<>();
		cycles.add(new Unicycle());
		cycles.add(new Bicycle());
		cycles.add(new Tricycle());
		
		for (Cycle cycle : cycles) {
			cycle.ride();
//			cycle.balance();
//			java.lang.Error: Unresolved compilation problem: 
//			The method balance() is undefined for the type Cycle
		}
		
		((Unicycle)cycles.get(0)).balance();
		((Bicycle)cycles.get(1)).balance();
//		((Tricycle)cycles.get(2)).balance();
//		The method balance() is undefined for the type Tricycle
	 
	}
	
}

class Cycle{
	public void ride() {
		System.out.println("Cycle ride " + wheels() + " wheels");
	}
	public int wheels() {
		return 0;
	}
}

class Unicycle extends Cycle {

	void balance() {
		System.out.println(this.getClass().getName() + " balance()");
	}
	
	@Override
	public void ride() {
		System.out.println("Unicycle ride " + wheels() + " wheels");
	}
	
	@Override
	public int wheels() {
		return 1;
	}
}

class Bicycle extends Cycle {

	void balance() {
		System.out.println(this.getClass().getName() + " balance()");
	}

	@Override
	public void ride() {
		System.out.println("Bicycle ride " + wheels() + " wheels");
	}
	
	@Override
	public int wheels() {
		return 2;
	}
}

class Tricycle extends Cycle {
	
	@Override
	public void ride() {
		System.out.println("Tricycle ride " + wheels() + " wheels");
	}
	
	@Override
	public int wheels() {
		return 3;
	}
}