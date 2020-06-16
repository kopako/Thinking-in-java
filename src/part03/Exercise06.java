package part03;

import static net.mindview.util.Range.*;

import java.util.stream.IntStream;

import static net.mindview.util.Print.*; 

/**
 * Exercise 6:   (2) Modify the two test( ) methods in the previous two programs 
 * so that they take two extra arguments, begin and end, and so that testval is 
 * tested to see if it is within the range between (and including) begin and end.
 * @author kopan.dmytro
 *
 */

class Exercise06 {   
	public static void main(String[] args) {
			print(test(10, 5,10,10));  
			print(test(5, 10,8,12));  
			print(test(5, 5,8,12));  
		
	}
	
	private static int test(int testval, int target) {
		if(testval > target)       return +1;
		else if(testval < target)       return -1;
		else       return 0; // Match  
	}   
	
	
	// Returns 1 if testval in range [begin:end], else returns -1
	private static int test(int testval, int target, int begin, int end) {
		return IntStream.rangeClosed(begin, end)
		                .anyMatch(a-> a == testval)? 1:-1;
	}
}	
