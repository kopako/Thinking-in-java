// Testing class Class.
package part13.exercise19;


import static net.mindview.util.Print.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

/**
 * Exercise 19:   (4) In ToyTest.java, use reflection to create a Toy object 
 * using the nondefault constructor. 
 * @author kopan.dmytro
 *
 */
class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots {
  FancyToy() { super(1); }
}

public class ToyTest {
  static void printInfo(Class cc) {
    print("Class name: " + cc.getName() +
      " is interface? [" + cc.isInterface() + "]");
    print("Simple name: " + cc.getSimpleName());
    print("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("part13.exercise19.Toy");
      Constructor[] constructors = c.getDeclaredConstructors();
      System.out.println(Arrays.toString(constructors));
      Object newInstance = constructors[1].newInstance(1);
      System.out.println(newInstance);
    } catch(ClassNotFoundException e) {
      print("Can't find FancyToy");
      System.exit(1);
    } catch (InstantiationException e) {
    	e.printStackTrace();
    	throw new RuntimeException(e);
	} catch (IllegalAccessException e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	} catch (IllegalArgumentException e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	} catch (InvocationTargetException e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	}
    printInfo(c);	
    for(Class face : c.getInterfaces())
      printInfo(face);
    Class up = c.getSuperclass();
    Object obj = null;
    try {
      // Requires default constructor:
      obj = up.newInstance();
    } catch(InstantiationException e) {
      print("Cannot instantiate");
      System.exit(1);
    } catch(IllegalAccessException e) {
      print("Cannot access");
      System.exit(1);
    }
    printInfo(obj.getClass());
  }
} /* Output:
Class name: typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name: typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name: typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name: typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : typeinfo.toys.Shoots
Class name: typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : typeinfo.toys.Toy
*///:~
