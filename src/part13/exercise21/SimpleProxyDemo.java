package part13.exercise21;


import static net.mindview.util.Print.*;

/**
 * Exercise 21:   
 * (3) Modify SimpleProxyDemo.java so that it measures method-call times. 
 * @author kopan.dmytro
 *
 */
interface Interface {
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() { print("doSomething"); }
	public void somethingElse(String arg) {
		print("somethingElse " + arg);
	}
}	

class SimpleProxy implements Interface {
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() {
		print("SimpleProxy doSomething");
		long startTime = System.nanoTime();
		proxied.doSomething();
		long endTime = System.nanoTime();
		System.out.printf("Elapsed time: %d nanoseconds\n",endTime-startTime);
	}
	public void somethingElse(String arg) {
		print("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}
}	

class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}