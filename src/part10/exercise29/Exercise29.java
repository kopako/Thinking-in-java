package part10.exercise29;

import java.util.PriorityQueue;

/**
 * Exercise 29:   (2) Create a simple class that inherits from Object and 
 * contains no members, and show that you cannot successfully add multiple 
 * elements of that class to a PriorityQueue. This issue will be fully 
 * explained in the Containers in Depth chapter. 
 * @author kopan.dmytro
 *
 */
public class Exercise29 extends Object {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		System.out.println(pq.offer(new Exercise29()));
		System.out.println(pq.offer(new Exercise29()));
		System.out.println(pq.offer(new Exercise29()));
	}
	//Exception in thread "main" java.lang.ClassCastException: part10.exercise29.Exercise29 cannot be cast to java.lang.Comparable


}
