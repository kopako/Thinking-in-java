package part10.exercise12;

import java.util.*;
import java.util.stream.*;
/**
 * Exercise 12:   (3) Create and populate a List<Integer>. Create a second 
 * List<Integer> of the same size as the first, and use ListIterators to read 
 * elements from the first List and insert them into the second in reverse order. 
 * (You may want to explore a number of different ways to solve this problem.) 
 * @author kopan.dmytro
 *
 */
class Exercise12 {

	public static void main(String[] args) {
		int size = 100;
		List<Integer> srcList = IntStream.range(0, size)
				                         .boxed()
				                         .collect(Collectors.toList());
		List<Integer> reverseList = new ArrayList<>(srcList.size());
		ListIterator<Integer> ri = srcList.listIterator(srcList.size());
		while(ri.hasPrevious()) {
			reverseList.add(ri.previous());
		}
		System.out.println(reverseList);
	}
}
