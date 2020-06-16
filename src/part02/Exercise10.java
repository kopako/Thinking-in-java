package part02;

/**
 * Exercise 10:   (3) Write a program with two constant values, one with alternating 
 * binary ones and zeroes, with a zero in the least-significant digit,
 * and the second, also alternating, with a one in the least-significant digit 
 * (hint: It’s easiest to use hexadecimal constants for this). Take these two
 * values and combine them in all possible ways using the bitwise operators, 
 * and display the results using Integer.toBinaryString( ).
 *
 * @author kopan.dmytro
 *
 */
class Exercise10 {

	public static void main(String[] args) {
		int a1 = 0b0101010101;
		int a2 = 0b1010101010;
		int cyclesNumber = 4;
		
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);
		System.out.println("a1.toBinaryString: " + Integer.toBinaryString(a1));
		System.out.println("a2.toBinaryString: " + Integer.toBinaryString(a2));
		int xor = a1;
		int bitwiseOr = a1;
		int bitwiseAnd = a1;
		for(int i = 0; i<cyclesNumber; i+=1) {
			xor ^= a2;
			bitwiseAnd &= a2;
			bitwiseOr |= a2;
			System.out.printf("%d. XOR: %s , %d is integer%n",i+1,Integer.toBinaryString(xor),xor);
			System.out.printf("%d. OR: %s , %d is integer%n",i+1,Integer.toBinaryString(bitwiseOr),bitwiseOr);
			System.out.printf("%d. AND: %s , %d is integer%n",i+1,Integer.toBinaryString(bitwiseAnd),bitwiseAnd);
		}

	}

}
