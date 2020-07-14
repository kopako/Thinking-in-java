package part10.exercise28;

import java.util.*;

/**
 * Exercise 28:   (2) Fill a PriorityQueue (using offer( )) with Double values 
 * created using java.util.Random, then remove the elements using poll( ) and 
 * display them.
 * @author kopan.dmytro
 *
 */
public class Exercise28 {

	public static void main(String[] args) {
		PriorityQueue<Double> pr = new PriorityQueue<>();
		Random r = new Random();
		for(int i = 0; i< 100; i++) {
			pr.offer(r.nextDouble());
		}
		
		while(pr.peek() != null)
		      System.out.println(pr.poll());
	}
}
