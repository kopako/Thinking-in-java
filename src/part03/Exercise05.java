package part03;

/**
 * Exercise 5:   (4) Repeat Exercise 10 from the previous chapter, using 
 * the ternary operator and a bitwise test to display the ones and zeroes, 
 * instead of Integer.toBinaryString( ). 
 */
class Exercise05 {

	public static void main(String[] args) {
//		int a = 0b0011100; //28
		int a = Integer.MAX_VALUE;
		int b = 0b10101;
		System.out.printf("a: %10d\t%32S%n",a,Integer.toBinaryString(a));
		System.out.printf("b: %10d\t%32S%n",b,Integer.toBinaryString(b));
		
		
		StringBuilder stringBuilderAnd = new StringBuilder();
		StringBuilder stringBuilderOr = new StringBuilder();
		StringBuilder stringBuilderXor = new StringBuilder();
		
		// Going through the integers and comparing them bit by bit
		for (int i = 31; i >= 0; i--) {
//			int bitAnd = getBit(a, i) & getBit(b, i);
//			int bitOr = getBit(a,i) | getBit(b,i);
//			int bitXor = getBit(a,i) ^ getBit(b,i);
			
			int bitAnd = getBit(a, i) == 0 ? 0 : getBit(b, i) == 0 ? 0 : 1;
			int bitOr = getBit(a,i) == 1 ? 1 : getBit(b,i) == 1 ? 1 : 0;
			int bitXor = getBit(a,i) == 0 ? getBit(b,i) : (getBit(b, i) == 1 ? 0 : 1);
			
			stringBuilderAnd.append(bitAnd);
			stringBuilderOr.append(bitOr);
			stringBuilderXor.append(bitXor);
		}
		
		System.out.printf("Bitwise &: %s%n",stringBuilderAnd);
		System.out.printf("Bitwise |: %s%n",stringBuilderOr);
		System.out.printf("Bitwise ^: %s%n",stringBuilderXor);
		
		
	}

	
	public static int getBit(int number, int indexOfBit) {
	    return (number  >> indexOfBit) & 1;
	}
	
}


