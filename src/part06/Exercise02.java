package part06;


/**
 * Exercise 2:   (2) Inherit a new class from class Detergent. Override scrub( ) 
 * and add a new method called sterilize( ). 
 * @author kopan.dmytro
 *
 */
class Exercise02 extends Detergent {
	
	@Override
	public void scrub() {
		super.scrub();
		super.append(" overrided method");
	}
	
	public void sterilize() { append("sterilize"); }

	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.foam();
	}

}

