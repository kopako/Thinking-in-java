package part02;


/**
 * Exercise 8:   (2) Show that hex and octal notations work with long values. 
 * Use Long.toBinaryString( ) to display the results.
 * @author kopan.dmytro
 *
 */
class Exercise08 {

	public static void main(String[] args) {
		
		long a1 = 0xa0L;
		long a2 = 0201L;
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(Long.toBinaryString(a1));
		System.out.println(Long.toBinaryString(a2));
	}

}
