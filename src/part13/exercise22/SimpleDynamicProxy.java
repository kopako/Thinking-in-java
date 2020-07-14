package part13.exercise22;


import static net.mindview.util.Print.print;

import java.lang.reflect.*;

/**
 * Exercise 22:
 * (3) Modify SimpleDynamicProxy.java so that it measures method-call times.
 * Exercise 23:   
 * (3) Inside invoke( ) in SimpleDynamicProxy.java, 
 * try to print the proxy argument and explain what happens.
 * there is no arguments in 
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

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass() +
				", method: " + method + ", args: " + args);
		if(args != null)
			for(Object arg : args)
				System.out.println("  " + arg);
		return method.invoke(proxied, args);
	}
}	

class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		long startTime = System.nanoTime();
		iface.doSomething();
		iface.somethingElse("bonobo");
		long endTime = System.nanoTime();
		System.out.printf("Elapsed time: %d\n", endTime - startTime);
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		// Insert a proxy and call again:
		Interface proxy = (Interface)Proxy.newProxyInstance(
				Interface.class.getClassLoader(),
				new Class[]{ Interface.class },
				new DynamicProxyHandler(real));
		consumer(proxy);
	}
} 