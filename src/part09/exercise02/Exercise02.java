package part09.exercise02;

/**
 * Exercise 2:   (1) Create a class that holds a String, and has a toString( ) 
 * method that displays this String. Add several instances of your new class 
 * to a Sequence object, then display them. 
 * @author kopan.dmytro
 *
 */

class Exercise02 {
	private String field;

	
	public Exercise02(String field) {
		super();
		this.field = field;
	}


	@Override
	public String toString() {
		return "Exercise02 [field=" + field + "]";
	}
	
	
}
