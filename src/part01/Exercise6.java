package part01;

/*
 Exercise 6:   (2) Write a program that includes and calls the storage( ) 
method defined as a code fragment in this chapter.  
 */
class Exercise6 {

	public static void main(String[] args) {

		System.out.println(storage("test"));
		 
	}

	private static int storage(String s) {   return s.length() * 2; }
	
}
