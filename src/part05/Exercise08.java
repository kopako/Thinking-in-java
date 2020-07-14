package part05;

import javax.swing.SortingFocusTraversalPolicy;

import part05.exercise08.*;

/**
 * Exercise 8:   (4) Following the form of the example Lunch.java, create a 
 * class called ConnectionManager that manages a fixed array of Connection 
 * objects. The client programmer must not be able to explicitly create 
 * Connection objects, but can only get them via a static method in 
 * ConnectionManager. When the ConnectionManager runs out of objects, it 
 * returns a null reference. Test the classes in main( ).  
 * @author kopan.dmytro
 *
 */
public class Exercise08 {

	public static void main(String[] args) {
		Connection con;
		int i = 0;
		do{
			System.out.println(i++);
			 con = ConnectionManager.pollConnection();
		} while (con != null);
	}
	
}
