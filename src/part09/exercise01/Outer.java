package part09.exercise01;

/**
 * Exercise 1:   (1) Write a class named Outer that contains an inner class 
 * named Inner. Add a method to Outer that returns an object of type Inner. 
 * In main( ), create and initialize a reference to an Inner.
 * 
 * Exercise 3:   (1) Modify Exercise 1 so that Outer has a private String 
 * field (initialized by the constructor), and Inner has a toString( ) that 
 * displays this field. Create an object of type Inner and display it.
 * 
 * @author kopan.dmytro
 *
 */
class Outer {
	private String field;
	
	public Outer(String field) {
		super();
		this.field = field;
	}

	class Inner {

		@Override
		public String toString() {
			return "Inner [field = " + field + " ]";
		}
	
		
	}
	
	Inner getInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer o=new Outer("this is private field");
		Outer.Inner in = o.getInner() ;
		System.out.println(in);
	}
}
