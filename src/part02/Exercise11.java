package part02;

/**
 * Exercise 11:   (3) Start with a number that has a binary one in the most 
 * significant position (hint: Use a hexadecimal constant). Using the signed
 * right-shift operator, right shift it all the way through all of its binary 
 * positions, each time displaying the result using Integer.toBinaryString( ).  
 * 
 * Exercise 12:   (3) Start with a number that is all binary ones. Left shift 
 * it, then use the unsigned right-shift operator to right shift through all of
 * its binary positions, each time displaying the result using Integer.toBinaryString( ).  
 *
 * @author kopan.dmytro
 *
 */

class Exercise11 extends Exercise10 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int a = 0b10000000_00000000_00000000_00000000;
//		int a = 0x80000000;
		int a = 0x7FFFFFFF + 1;
		System.out.println("a: "+ a);
		int i = 0;
		while((a&1) != 1) {
			a= a>>1;
			System.out.println((i+=1) + "\t" +Integer.toBinaryString(a) + "\t" + a);
		}
		
		int b = 0b11111111_11111111_11111111_11111111;
		System.out.println("b: "+b);
		b<<=1;
		System.out.println("b<<=1:\t"+ Integer.toBinaryString(b) + "\t" + b);
		for (int j = 0; j < 32; j++) {
			b>>>=1;
			System.out.println("b>>>=1:\t"+ Integer.toBinaryString(b) + "\t" + b);
		}
		

//		b>>>=1;
//		System.out.println("b>>>=1:\t"+ Integer.toBinaryString(b) + "\t" + b);
//		
		
//		for (int j = 0; j < 32; j++) {
//			b<<=1;
//			System.out.println((j) + "\t" +Integer.toBinaryString(b)+"\t"+ b);
//		}
//		
	}
}
