package part10.exercise18;

import java.util.*;

/**
 * Exercise 18:   (3) Fill a HashMap with key-value pairs. Print the results to 
 * show ordering by hash code. Extract the pairs, sort by key, and place the 
 * result into a LinkedHashMap. Show that the insertion order is maintained. 
 * @author kopan.dmytro
 *
 */
class Exercise18 {
	
	public static void main(String[] args) {
		Random random = new Random();
		Map<Integer, String> rootMap = new HashMap<Integer, String>();
		
		for (int i = 0; i < 10; i++) {
			rootMap.put(random.nextInt(100), "value" + random.nextInt(10));
		}
		System.out.println(rootMap);
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>(new TreeMap<>(rootMap));
		System.out.println(sortedMap);
	}

}
