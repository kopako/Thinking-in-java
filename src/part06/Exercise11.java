package part06;

import static net.mindview.util.Print.print;

public class Exercise11 {

	class Cleanser {
	  private String s = "Cleanser";
	  public void append(String a) { s += a; }
	  public void dilute() { append(" dilute()"); }
	  public void apply() { append(" apply()"); }
	  public void scrub() { append(" scrub()"); }
	  public String toString() { return s; }
	}	

	class Detergent {
		private Cleanser cleanser;
	  public void scrub() {
	    cleanser.append(" Detergent.scrub()");
	    cleanser.scrub(); // Call base-class version
	  }
	  public void foam() { cleanser.append(" foam()"); }
	} 
}
