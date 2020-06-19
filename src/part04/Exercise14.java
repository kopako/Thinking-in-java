package part04;

/**
 * Exercise 14:   (1) Create a class with a static String field that is 
 * initialized at the point of definition, and another one that is initialized 
 * by the static block. Add a static method that prints both fields and 
 * demonstrates that they are both initialized before they are used.
 * @author kopan.dmytro
 *
 */
class Exercise14 {

	static String field1 = "field1";
	static String field2;
	static {
		field2 = "field2";
	}
	
	static void method() {
		System.out.println(field1);
		System.out.println(field2);
	}
	
	public static void main(String[] args) {
		method();
	}
}
