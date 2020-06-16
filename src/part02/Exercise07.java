package part02;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.*;

/**
 * Exercise 7:   (3) Write a program that simulates coin-flipping.
 * @author kopan.dmytro
 *
 */
class Exercise07 {
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println(coinFlip());
	}
	
	public static boolean coinFlip() {
		return random.ints( 1,0,2 ).findFirst().equals(Integer.valueOf(1));
		
	}
}
