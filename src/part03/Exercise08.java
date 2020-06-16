package part03;

/**
 * Exercise 8:   (2) Create a switch statement that prints a message for each case, 
 * and put the switch inside a for loop that tries each case. 
 * Put a break after each case and test it, then remove the breaks and 
 * see what happens. 
 * 
 * A great example of a bad task description.
 * @author kopan.dmytro
 *
 */
class Exercise08 {

	public static void main(String[] args) {
		String[] arr = new String[] {"First", "Second", "Third"};
		
		for (String string : arr) {			
			switch (string) {
			case "First":
			case "Second":
			case "Third":
				System.out.println(string);
				break;
				
			default:
				System.out.println("No value in \"arr\"");
				break;
			}
		}
	}
}
