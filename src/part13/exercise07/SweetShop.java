package part13.exercise07;

import static net.mindview.util.Print.*;

/**
 * Exercise 7:   (3) Modify SweetShop.java so that each type of object creation 
 * is controlled by a command-line argument. That is, if your command line is 
 * "Java Sweetshop Candy," then only the Candy object is created. Notice how you 
 * can control which Class objects are loaded via the commandline argument.
 * @author kopan.dmytro
 *
 */
class Candy {
	static { print("Loading Candy"); }
}

class Gum {
	static { print("Loading Gum"); }
}

class Cookie {
	static { print("Loading Cookie"); }
}

public class SweetShop {
	public static void main(String[] args) {	

		if(args.length<1) {
			System.out.println("Provide name of the class to be created");
			System.exit(1);
		}
		
		try {
			Class.forName("part13.exercise07."+args[0]);
		} catch(ClassNotFoundException e) {
			print("Couldn't find " + args[0]);
		}

	}
} 