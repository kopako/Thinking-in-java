package part11.exercise05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exercise 5:   (3) Create your own resumption-like behavior using a while loop 
 * that repeats until an exception is no longer thrown.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise05 {

	public static void main(String[] args) {

		boolean exceptionBlock = true;
		int[] arr = new int[5];
		while(exceptionBlock) {
			try {
				System.out.println("type index of the array");
				System.out.println(arr[new Scanner(System.in).nextInt()]);
				exceptionBlock = false;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("try 0-4");
				continue;
			}
		}
		
//		this don't work
//		while(exceptionBlock) {
//			try(Scanner scan = new Scanner(System.in);) {
//				int integer = scan.nextInt();
////				exceptionBlock = false;
//			} catch (InputMismatchException e) {
////				e.printStackTrace();
//				continue;
//			}
//		}
		
	}

}
