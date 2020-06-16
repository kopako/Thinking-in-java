package part02;

/**
 * Exercise 13:   (1) Write a method that displays char values in binary form. 
 * Demonstrate it using several different characters.
 *  
 * @author kopan.dmytro
 *
 */
class Exercise13 {

	public static void main(String[] args) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println("character " + alphabet[i] + " is:\t" + Integer.toBinaryString(alphabet[i]));
		}
	}

}
