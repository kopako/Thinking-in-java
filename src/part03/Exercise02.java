package part03;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Exercise 2:   (2) Write a program that generates 25 random int values.
 * For each value, use an if-else statement to classify it as greater than, 
 * less than, or equal to a second randomly generated value.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise02 {
	
	public static void main(String[] args) {
		int[] ra = new Random().ints().limit(25).toArray();
		
		IntStream.range(0, ra.length-1)
                 .mapToObj(a -> classify(ra[a], ra[a+1]))
                 .forEach(System.out::println);
	}
	
	public static String classify(int a, int b) {
		if (a>b) return "greater than";
		else if (a<b) return "less than";
		else if (a==b) return "equal";
		else return "NaN";
	}

}
