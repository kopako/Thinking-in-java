package part11.exercise21;

/**
 * Exercise 21:   (2) Demonstrate that a derived-class constructor cannot catch 
 * exceptions thrown by its base-class constructor. 
 * @author kopan.dmytro
 *
 */
class Exercise21 {

	public static void main(String[] args) {
		try {
			Child cd = new Child();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Parent {
	public Parent() throws Exception{
		throw new Exception();
	}
}

class Child extends Parent{

	public Child() throws Exception {
		super();
//		try {
//			super();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	
}