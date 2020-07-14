package part10.exercise24;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Exercise 24:   (2) Fill a LinkedHashMap with String keys and objects of your choice. 
 * Now extract the pairs, sort them based on the keys, and reinsert them into the Map. 
 * @author kopan.dmytro
 *
 */
class Exercise24 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new LinkedHashMap<>();
		Map<String, Integer> buf = new LinkedHashMap<>();
		map.put("Z", 32);
		map.put("J", 33);
		map.put("C", 34);
		
		List<String> keys = map.keySet().stream().sorted().collect(Collectors.toList());
		
		for (String string : keys) {
			buf.put(string, map.get(string));
		}
		map.clear();
		map.putAll(buf);
		
		System.out.println(map);
		
	}
	

}
