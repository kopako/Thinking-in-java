package part03;

import java.util.stream.IntStream;

/**
 * Exercise 1:   (1) Write a program that prints values from 1 to 100. 
 * 
 * @author kopan.dmytro
 *
 */
class Exercise01 {

	public static void main(String[] args) {
		IntStream.rangeClosed(1,100)
			     .forEach(System.out::println);
	}

}
