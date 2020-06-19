package part04;

/**
 * Exercise 16:   (1) Create an array of String objects and assign a String to 
 * each element. Print the array by using a for loop.  
 * Exercise 17:   (2) Create a class with a constructor that takes a String 
 * argument. During construction, print the argument. Create an array of object 
 * references to this class, but don’t actually create objects to assign into 
 * the array. When you run the program, notice whether the initialization 
 * messages from the constructor calls are printed.  
 * Exercise 18:   (1) Complete the previous exercise by creating objects to 
 * attach to the array of references.
 *   
 * @author kopan.dmytro
 *
 */
class Exercise16 {

	public Exercise16(String arg) {
		System.out.println(arg);
	}
	
	public static void main(String[] args) {
		// 16
		String[] array = new String[] {"a","r","r", "a", "y" };
		for (String string : array) {
			System.out.println(string);
		}
		//17
		Exercise16[] exercises = new Exercise16[20];
		//18
		for (int i = 0; i < exercises.length; i++) {
			exercises[i] = new Exercise16("exercise " + i);
		}
		
	}

}
