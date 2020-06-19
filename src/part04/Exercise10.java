package part04;

/**
 * Exercise 10:   (2) Create a class with a finalize( ) method that prints a 
 * message. In main( ), create an object of your class. Explain the behavior of 
 * your program.  
 * Exercise 11:   (4) Modify the previous exercise so that your finalize( ) 
 * will always be called.  
 * Exercise 12:   (4) Create a class called Tank that can be filled and emptied, 
 * and has a termination condition that it must be empty when the object is 
 * cleaned up. Write a finalize( ) that verifies this termination condition. 
 * In main( ), test the possible scenarios that can occur when your Tank is used.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise10 {

	public Exercise10() {
		super();
		finalize();
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalization of "+ this);
	}
	
	public static void main(String[] args) {
		Exercise10 ex = new Exercise10();
		new Tank(true);
		System.gc();
	}
		
}

class Tank {
	
	private boolean filled;
	
	public Tank() {
		super();
	}

	public Tank(boolean filled) {
		super();
		this.filled = filled;
	}


	public void fill() {
		this.filled = true;
	}
	
	public void empty() {
		this.filled = false;
	}

	@Override
	protected void finalize() {
		if(filled) { System.out.println(this + " should be emptied!"); }
	}
		
}
