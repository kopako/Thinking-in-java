package part09.exercise21;

/**
 * Exercise 21:   (2) Create an interface that contains a nested class that has a 
 * static method that calls the methods of your interface and displays the results. 
 * Implement your interface and pass an instance of your implementation to the
 * method.
 * @author kopan.dmytro
 *
 */

// This exercise has confused me!!!
public interface Exercise21 {
	int methodEx(Exercise21 ex) ;
	static class Nested {
		static void method() {
			Exercise21 crazyness = new Exercise21() {
				@Override
				public int methodEx(Exercise21 ex) {
					return 3301;
				}
			};
			System.out.println(crazyness.methodEx(crazyness));
		}
	}
}
