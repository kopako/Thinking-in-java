package part12.exercise07;

/**
 * Exercise 7:   (5) Using the documentation for java.util.regex.Pattern as a
 * resource, write and test a regular expression that checks a sentence to see 
 * that it begins with a capital letter and ends with a period.
 * @author kopan.dmytro
 *
 */
class Exercise07 {

	
	static boolean match(String sentence) {
		String pattern = "^\\s?[A-Z].*\\.$";
		return sentence.matches(pattern); 
	}

	public static void main(String[] args) {
		String sen1 = "This is a valid sentence.";
		String sen2 = "not a valid sentence";
		
//		assert match(sen1);
//		assert match(sen2);
		
		System.out.println(match(sen1));
		System.out.println(match(sen2));

	}

}
