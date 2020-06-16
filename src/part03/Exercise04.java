package part03;

/**
 * Exercise 4:   (3) Write a program that uses two nested for loops and the modulus 
 * operator (%) to detect and print prime numbers (integral numbers that are not 
 * evenly divisible by any other numbers except for themselves and 1). 
 * @param num
 * @return
 */
class Exercise04 {

	public static void main(String[] args) {
		// I haven't ubnderstand why do you need nested loop but here you go:
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				
			}
		}

	}


	public static boolean isPrime(int num) {
	    // Filter out negative numbers, 0 and 1
	    if (num <= 1)
	      return false;
	    // Factors of a number form pairs and the middle pair is the square root so no
	    // reason to test numbers beyond that
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	      if (num % i == 0) {
	        return false;
	      }
	    }
	    return true;
	}
}