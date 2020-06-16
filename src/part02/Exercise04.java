package part02;

import java.math.*;

/**
 * Exercise 4:   (2) Write a program that calculates 
 * velocity using a constant distance and a constant time.
 * @author kopan.dmytro
 *
 */
class Exercise04 {

	public static void main(String[] args) {
		double distance = 0;
		double time =10;
		
		System.out.println(
				getVelocity(distance, time)
		);
	}
	
	/**
	 * Will return distance / time.  
	 * If divide by zero, returns Infinite.
	 * If 0 divided, returns NaN (not a number).
	 * No exceptions processed.
	 * No checkups for distance and time to be not negative.
	 * @param distance
	 * @param time
	 * @return velocity
	 */
	public static double getVelocity(double distance, double time)  {
		return distance/time;
	}

}
