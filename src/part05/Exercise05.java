package part05;

import part05.exercise05.*;

/**
 * Exercise 5:   (2) Create a class with public, private, protected, and 
 * package-access fields and method members. Create an object of this 
 * class and see what kind of compiler messages you get when you try 
 * to access all the class members. Be aware that classes in the same 
 * directory are part of the “default” package.
 * @author kopan.dmytro
 *
 */
class Exercise05 {

	public static void main(String[] args) {
		AccessTest at = new AccessTest();
//		System.out.println(at.privateField);  //The field AccessTest.privateField is not visible
//		System.out.println(at.protectedField); //The field AccessTest.protectedField is not visible
//		System.out.println(at.packageField); //The field AccessTest.packageField is not visible
		System.out.println(at.publicField);
//		at.privateMethod(); //The method privateMethod() from the type AccessTest is not visible
//		at.protectedMethod(); //The method protectedMethod() from the type AccessTest is not visible
//		at.packageMethod(); //The method packageMethod() from the type AccessTest is not visible
		at.publicMethod();
		
	}

}
