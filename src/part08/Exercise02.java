package part08;

/**
 * Exercise 2:   (1) Create a class as abstract without including any abstract 
 * methods and verify that you cannot create any instances of that class. 
 * @author kopan.dmytro
 *
 */
abstract class Exercise02 {

	public static void main(String[] args) {
		Exercise02 ex = new Ex02Derived();
		ex.method();
	}
	void method() {
		System.out.println("valid class");
	}
}

class Ex02Derived extends Exercise02 {
	
}
