package part03;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Exercise09 {

	/**
	 * Exercise 9:   (4) A Fibonacci sequence is the sequence
	 * of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number
	 * (from the third on) is the sum of the previous two. Create a method that 
	 * takes an integer as an argument and displays that many Fibonacci numbers 
	 * starting from the beginning, e.g., If you run java Fibonacci 5 (where 
	 * Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5. 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fibonacci(5)	);
	}

	private static String fibonacci(int n) {
		return Stream.iterate(new int[] {1, 1}, f -> new int[] {f[1], f[0] + f[1]})
					 .limit(5)
				     .map(a -> a[0])
				     .map(String::valueOf)
				     .collect(Collectors.joining(","));
	}
}
