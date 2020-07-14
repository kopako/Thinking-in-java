package part13.exercise17;
// Using reflection to show all the methods of a class,
// even if the methods are defined in the base class.
// {args: ShowMethods}
import java.lang.reflect.*;
import java.util.regex.*;
import static net.mindview.util.Print.*;


/**
 * Exercise 17:   (2) Modify the regular expression in ShowMethods.java to 
 * additionally strip off the keywords native and final (hint: use the OR 
 * operator’|’)-
 * 
 * Exercise 18:   (1) Make ShowMethods a non-public class and verify that
 * the synthesized default constructor no longer shows up in the output. 
 * @author kopan.dmytro
 *
 */
//public 
class ShowMethods {
	private static String usage =
			"usage:\n" +
					"ShowMethods qualified.class.name\n" +
					"To show all methods in class or:\n" +
					"ShowMethods qualified.class.name word\n" +
					"To seargsch for methods involving 'word'";
	private static Pattern p = Pattern.compile("(\\w+\\.)|(\\bfinal\\s)|(\\bnative\\s)"); //this regex will find words with dot in the end or static or final
	public static void main(String[] args) {
		String[] args2 = "part13.exercise17.ShowMethods".split(" ");
		if(args2.length < 1) {
			print(usage);
			System.exit(1);
		}
		int lines = 0;
		try {
			//	      Class<?> c = Class.forName(args[0]);
			Class<?> c = Class.forName(args2[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args2.length == 1) {
				for(Method method : methods)
					print(
							p.matcher(
									method
									.toString()).replaceAll("")
							);
				for(Constructor ctor : ctors)
					print(
							p.matcher(
									ctor
									.toString()).replaceAll("")
							);
				lines = methods.length + ctors.length;
			} else {
				for(Method method : methods)
					if(method.toString().indexOf(args2[1]) != -1) {
						print(
								p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				for(Constructor ctor : ctors)
					if(ctor.toString().indexOf(args2[1]) != -1) {
						print(p.matcher(
								ctor.toString()).replaceAll(""));
						lines++;
					}
			}
		} catch(ClassNotFoundException e) {
			print("No such class: " + e);
		}
	}
} /* Output:
public static void main(String[])
public native int hashCode()
public final native Class getClass()
public final void wait(long,int) throws InterruptedException
public final void wait() throws InterruptedException
public final native void wait(long) throws InterruptedException
public boolean equals(Object)
public String toString()
public final native void notify()
public final native void notifyAll()
public ShowMethods()
 *///:~
