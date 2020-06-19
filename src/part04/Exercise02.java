package part04;


/**
 * Exercise 1:   (1) Create a class containing an uninitialized String reference. 
 * Demonstrate that this reference is initialized by Java to null.  
 * Exercise 2:   (2) Create a class with a String field that is initialized at 
 * the point of definition, and another one that is initialized by the constructor. 
 * What is the difference between the two approaches? 
 * @author kopan.dmytro
 *
 */
class Exercise02 {
	public static void main(String[] args) {
		Exercise02SubClass01 a = new Exercise02SubClass01();
		Exercice02SubClass02 b = new Exercice02SubClass02("Definition in constructer");
		System.out.println(a);
		System.out.println(b);
	}
}

class Exercise02SubClass01 {
	private String a = "Definition initialization";

	public String toString() {
		return "Exercise02SubClass01 [a=" + this.a + "]";
	}
}

class Exercice02SubClass02 {
	private String b;

	public Exercice02SubClass02(String b) {
		this.b = b;
	}

	public String toString() {
		return "Exercice02SubClass02 [b=" + this.b + "]";
	}
}