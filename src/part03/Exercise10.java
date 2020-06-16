package part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Exercise 10:   (5) A vampire number has an even number of digits and is 
 * formed by multiplying a pair of numbers containing half the number of 
 * digits of the result. The digits are taken from the original number in 
 * any order. Pairs of trailing zeroes are not allowed. Examples include:  
 * 1260 = 21 * 60  1827 = 21 * 87  2187 = 27 * 81  Write a program that 
 * finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 * 
 * @author kopan.dmytro
 *
 */
class Exercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 100 ; i++) {
			for (int j = i; j < 100; j++) {
				int result = i*j;
				if (result / 1000 >=1 && result / 1000 < 10 && isVapireNumber(i,j,result)) {
						System.out.printf("%d\t%d\t%d%n",i,j,result);
				}
			}
		}
	}

	private static boolean isVapireNumber(int i, int j, int result) {
		List<Integer> sourceNumbers = new ArrayList<>();
		List<Integer> resultNumbers = new ArrayList<>();
		sourceNumbers.add(i % 10);
		sourceNumbers.add(i / 10 % 10);
		sourceNumbers.add(j % 10);
		sourceNumbers.add(j / 10 % 10);
		resultNumbers.add(result % 10);
		resultNumbers.add(result / 10 % 10);
		resultNumbers.add(result / 100 % 10);
		resultNumbers.add(result / 1000 % 10);
		
		Collections.sort(sourceNumbers);
		Collections.sort(resultNumbers);
		
		return sourceNumbers.equals(resultNumbers);
	}

	
}
