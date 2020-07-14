package part08;

import static net.mindview.util.Print.*;

/**
 * Exercise 8:   (2) In polymorphism.Sandwich.java, create an interface called 
 * FastFood (with appropriate methods) and change Sandwich so that it also 
 * implements FastFood. 
 * 
 * @author kopan.dmytro
 *
 */

// Interfaces should be an adjective entities, not a noun by recommendations.  
interface FastFood {
	
	void burger();
	
}

class Meal {
  Meal() { print("Meal()"); }
}

class Bread {
  Bread() { print("Bread()"); }
}

class Cheese {
  Cheese() { print("Cheese()"); }
}

class Lettuce {
  Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
  Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
  PortableLunch() { print("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood {
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  
  public Sandwich() { print("Sandwich()"); }
  
  public static void main(String[] args) {
    new Sandwich();
  }

	@Override
	public void burger() {
		System.out.println("Burger");
	}
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
