package part10.exercise19;

import java.util.*;

/**
 * Exercise 19:   (2) Repeat the previous exercise with a HashSet and LinkedHashSet.
 * @author kopan.dmytro
 *
 */
class Exercise19 {
	
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> rootSet = new HashSet();
		
		for (int i = 0; i < 10; i++) {
			rootSet.add(random.nextInt(100));
		}
		System.out.println(rootSet);
		LinkedHashSet<Integer> sortedSet = new LinkedHashSet<>(new TreeSet<>(rootSet));
		System.out.println(sortedSet);
	}

}
