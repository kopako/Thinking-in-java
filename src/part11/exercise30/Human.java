package part11.exercise30;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Exercise 30: (2) Modify Human.java so that the exceptions inherit from
 * RuntimeException. Modify main( ) so that the technique in TurnOffChecking.java is
 * used to handle the different types of exceptions. 
 * 
 * @author kopan.dmytro
 *
 */
class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Human {
  public static void main(String[] args) {
	  for(int i = 0; i < 4; i++) {
		throwRuntimeException(i);  
	  }
	  
	  // Catch the exact type:
//    try {
//      throw new Sneeze();
//    } catch(RuntimeException e) {
//    	try {
//    		throw e.getCause()
//    	}
//    } catch(Sneeze s) {
//      System.out.println("Caught Sneeze");
//    } catch(Annoyance a) {
//      System.out.println("Caught Annoyance");
//    }
//    // Catch the base type:
//    try {
//      throw new Sneeze();
//    } catch(Annoyance a) {
//      System.out.println("Caught Annoyance");
//    }
  }
  
  static void throwRuntimeException(int type) {
	    try {
	      switch(type) {
	        case 0: throw new Annoyance();
	        case 1: throw new Sneeze();
	        case 2: throw new RuntimeException("Where am I?");
	        default: return;
	      }
	    } catch(Exception e) { // Adapt to unchecked:
	      throw new RuntimeException(e);
	    }
	  }
}
