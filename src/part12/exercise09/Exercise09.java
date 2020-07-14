package part12.exercise09;

import part12.exercise08.Splitting;

/**
 * Exercise 9:   (4) Using the documentation for java.util.regex.Pattern as a 
 * resource, replace all the vowels in Splitting.knights with underscores
 * @author kopan.dmytro
 *
 */
public class Exercise09 {

	public static void main(String[] args) {
		System.out.println(Splitting.knights.replaceAll("[AOIUEYaoiuey]","_"));
	}
}
