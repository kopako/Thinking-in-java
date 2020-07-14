package part11.exercise25;

/**
 * Exercise 25: (2) Create a three-level hierarchy of exceptions. Now create a base-class A
 * with a method that throws an exception at the base of your hierarchy. Inherit B from A and
 * override the method so it throws an exception at level two of your hierarchy. Repeat by
 * inheriting class C from B. In main( ), create a C and upcast it to A, then call the method. 
 * @author kopan.dmytro
 *
 */
class Exercise25 {

	public static void main(String[] args) {
		A a = new C();
		try {
			a.method();
		} catch (Exception1 e) {
			e.printStackTrace();
		}
	}

}

class A {
	void method() throws Exception1 {
		throw new Exception1();
	}
}
class B extends A{

	@Override
	void method() throws Exception2 {
		throw new Exception2();
	}
	
}
class C extends B {

	@Override
	void method() throws Exception3 {
		throw new Exception3();
	}
	
}


class Exception1 extends Exception{}
class Exception2 extends Exception1{}
class Exception3 extends Exception2{}

