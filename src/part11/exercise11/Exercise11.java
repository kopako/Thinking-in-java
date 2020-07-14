package part11.exercise11;

/**
 * Exercise 11:   (1) Repeat the previous exercise, but inside the catch clause, 
 * wrap g( )’s exception in a RuntimeException. 
 * 
 * Exercise 10:   (2) Create a class with two methods, f( ) and g( ). In g( ), 
 * throw an exception of a new type that you define. In f( ), call g( ), catch 
 * its exception and, in the catch clause, throw a different exception (of a 
 * second type that you define). Test your code in main( ).
 * @author kopan.dmytro
 *
 */
class Exercise11 {
	
	public static void main(String[] args) {
			f();
	}
	
	
	static void f() {
		try {
			g();
		} catch (Exception1 e) {
			throw new RuntimeException(e);
		}
	}
	
	static void g()throws Exception1 {throw new Exception1();}
	
}

class Exception1 extends Exception {}
class Exception2 extends Exception {

	public Exception2() {
		super();
	}

	public Exception2(String var1) {
		super(var1);
	}

	public Exception2(Throwable var1) {
		super(var1);
	}
	
}