package part01;

import java.util.LinkedList;

/*
 * Exercise 9:   (2) Write a program that demonstrates that autoboxing
 *  works for all the primitive types and their wrappers.
 */
class Exercise9 {
	public static void main(String[] args) {
		LinkedList<Integer> listOfIntegers = new LinkedList<>();
		listOfIntegers.add(3);
		listOfIntegers.stream()
			.map(a -> a.getClass().getName())
			.forEach(System.out::println);
	}

}
