package part09.exercise19;

/**
 * Exercise 19:   (2) Create a class containing an inner class that itself 
 * contains an inner class. Repeat this using nested classes.
 * Note the names of the .class files produced by the compiler. 
 * @author kopan.dmytro
 *
 */
public class Exercise19 {
	class Inner{
		class InnerInner{}
	}
	
	static class StaticInner{
		static class StaticInnerInner{}
	}
}
