package part10.exercise14;

import java.util.*;

/**
 * Exercise 14:   (3) Create an empty LinkedList<Integer>. Using a Listlterator, 
 * add Integers to the List by always inserting them in the middle of the List.
 * @author kopan.dmytro
 *
 */
class Exercise14 {

	public static void main(String[] args) {
		LinkedList<Integer> ints = new LinkedList<>();
		for (int i = 0; i < 30; i++) {

			System.out.print("size: " + ints.size());
			System.out.println("\tindex: " + ints.size()/2);
			ints.add(ints.size()/2, i);

		}
		System.out.println(ints);
	}

}
