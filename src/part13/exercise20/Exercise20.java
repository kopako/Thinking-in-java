package part13.exercise20;

import static net.mindview.util.Print.print;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.Function;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise 20:   (5) Look up the interface for java.lang.Class in the JDK 
 * documentation from http://java.sun.com. Write a program that takes the name 
 * of a class as a command-line argument, then uses the Class methods to dump 
 * all the information available for that class. Test your program with a 
 * standard library class and a class you create.
 * @author kopan.dmytro
 *
 */
public class Exercise20 {

	private static String usage =
			"usage:\n" +
					"ShowMethods qualified.class.name\n" +
					"To show all methods in class or:\n" +
					"ShowMethods qualified.class.name word\n" +
					"To seargsch for methods involving 'word'";
	private static Pattern p = Pattern.compile("(\\w+\\.)|(\\bfinal\\s)|(\\bnative\\s)"); //this regex will find words with dot in the end or static or final
	
	public static void main(String[] args) {
		
		List<Method> methodList = Arrays.stream(Class.class.getMethods())
			.filter(m -> m.toString().indexOf("()") != -1)
			.collect(Collectors.toList());
		
//		String[] args2 = "part13.exercise17.ShowMethods".split(" ");
//		String[] args2 = "java.lang.String".split(" ");
		if(args.length < 1) {
			print(usage);
			System.exit(1);
		}
		try {
				      Class<?> c = Class.forName(args[0]);
//			Class<?> c = Class.forName(args2[0]);
			
			for (Method method1 : methodList) {
				String methodName = method1.toString().replaceAll("(\\w+\\.)|(\\bpublic\\s)|(\\bfinal\\s)|(\\bstatic\\s)|(\\bnative\\s)", "");
				System.out.println(methodName);
				try{ 
					if(methodName.indexOf("[]")!=-1) System.out.println("\t" + Arrays.toString((Object[])method1.invoke(c, null)));
					else System.out.println("\t" + method1.invoke(c, null));
					Stream.generate(() -> "*").limit(80).forEach(System.out::print);
					System.out.println();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			} 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
	
} 

