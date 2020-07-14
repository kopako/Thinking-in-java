package part13.exercise25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import part13.exercise25.pack.*;

/**
 * Exercise 25:   (2) Create a class containing private, protected and package-access methods. 
 * Write code to access these methods from outside of the class’s package.
 * @author kopan.dmytro
 *
 */
public class Exercise25 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		A a = new A();
		Method privateMethodA = a.getClass().getDeclaredMethod("privateMethod");
		privateMethodA.setAccessible(true);
		privateMethodA.invoke(a);
		Method protectedMethodA = a.getClass().getDeclaredMethod("protectedMethod");
		protectedMethodA.setAccessible(true);
		protectedMethodA.invoke(a);
		Method packageMethodA = a.getClass().getDeclaredMethod("packageMethod");
		packageMethodA.setAccessible(true);
		packageMethodA.invoke(a);
	}
}
