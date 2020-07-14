package part06;

import part06.exercise15.Ex15Root;

/**
 * Exercise 15:   (2) Create a class inside a package. Your class should contain 
 * a protected method. Outside of the package, try to call the protected method 
 * and explain the results. Now inherit from your class and call the protected 
 * method from inside a method of your derived class. 
 * @author kopan.dmytro
 *
 */
public class Exercise15 extends Ex15Root {

	public static void main(String[] args) {
		Ex15Root root = new Ex15Root();
//		root.method();//The method method() from the type Ex15Root is not visible
		Exercise15 ex = new Exercise15();
		ex.method();
		
	}

}
