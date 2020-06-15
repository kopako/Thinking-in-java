package part01;

import java.util.Date;

/**
*Exercise 2:   (1) Following the HelloDate.java example in this chapter,
* create a “hello, world” program that simply displays that statement. 
* You need only a single method in your class (the “main” one that gets 
* executed when the program starts). Remember to make it static and to 
* include the argument list, even though you don’t use the argument list. 
* Compile the program with javac and run it using java. If you are using a 
* different development environment than the JDK, learn how to compile and 
* run programs in that environment.
*/
class Exercise2 {
	 public static void main(String[] args) {
		    printDate(args);
		  }

	 /**
	  * prints in {@code System.out.println()} Hello, it's: </br> Mon Mar 16 14:40:08 CET 2020 </br>
	  * where date is current date.
	  * @param args
	  */
	  public static void printDate(String[] args) {
		  System.out.println("Hello, it's: ");
		  System.out.println(new Date());
	  }

}
