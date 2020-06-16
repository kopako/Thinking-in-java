package part02;

/**
 * Exercise 14:   (3) Write a method that takes two String arguments and uses 
 * all the boolean comparisons to compare the two Strings and print the
 * results. For the == and !=, also perform the equals( ) test. In main( ), 
 * call your method with some different String objects. 
 * @author kopan.dmytro
 *
 */
class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method("word1", new String("word1"));
	}
	
	public static void method(String word1, String word2) {
		System.out.println("==\t"+ (word1 == word2));
		System.out.println("!=\t"+ (word1 != word2));
		System.out.println("equals()\t"+word1.equals(word2));
		
	}

}
