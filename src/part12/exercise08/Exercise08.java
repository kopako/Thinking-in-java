package part12.exercise08;

import static part12.exercise08.Splitting.knights;

import java.util.Arrays;

/**
 * Exercise 8:   (2) Split the string Splitting.knights on the words "the" 
 * or “you."  
 * @author kopan.dmytro
 *
 */
class Exercise08 {

	public static void main(String[] args) {
		System.out.println(knights);
		String[] strings = knights.split("(\\W[T,t]he\\s)|(\\W[Y,y]ou\\s)");
		
		for (String string : strings) {
			System.out.println(string);
		}

	}

}
