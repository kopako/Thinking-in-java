package part10.exercise25;

import java.util.*;
import java.util.stream.*;
import net.mindview.util.*;

/**
 * Exercise 25:   (3) Create a Map<String,ArrayList<Integer>>. Use net.mindview.
 * TextFile to open a text file and read it in a word at a time (use "\\W+" as 
 * the second argument to the TextFile constructor). Count the words as you read 
 * them in, and for each word in the file, record in the ArrayList<Integer> the 
 * word count associated with that word—this is, in effect, the location in the 
 * file where that word was found.  
 * Exercise 26:   (4) Take the resulting Map from the previous exercise and 
 * re-create the order of the words as they appeared in the original file.
 * @author kopan.dmytro
 *
 */
class Exercise25 {

	public static void main(String[] args) {
		List<String> wordList = new TextFile("SetOperations.java", "\\W+");
		
		System.out.println(wordList);
		
		Map<String, ArrayList<Integer>> map = new HashMap<>();
		//25
		IntStream.range(0, wordList.size())
		         .forEach(i ->{
		        	 if(map.get(wordList.get(i))==null) {
		        		 ArrayList<Integer> list = new ArrayList<>();
		        		 list.add(i);
		        		 map.put(wordList.get(i), list);
		        	 } else {
		        		 map.get(wordList.get(i)).add(i);
		        	 }
		        	 
		         });
		System.out.println(map);
		
		//26
		LinkedList<String> recreated = new LinkedList<>();
		int maxIndex = map.values().stream().mapToInt(a -> Collections.max(a)).max().getAsInt();
		IntStream.rangeClosed(0, maxIndex)
	          .forEach(index -> map.forEach((key,value) -> {
					if (value.contains(index)) {
						recreated.add(key);
					}
	          }));

		System.out.println(recreated);
		}
	
//		for (int j = 0; j <= maxIndex ; j++) {
//			map.forEach((k,v) -> {
//				if (v.contains(j)) {
//					recreated.add(k);
//				}
//			});
	
//		map.forEach((k,v) -> v.stream().forEach(i -> recreated.add(i,k)));
//		System.out.println(recreated);
//		
//		System.out.println(map.values().stream().anyMatch(a -> a.contains(0)));
//		
//		Integer lastIndex = Stream.iterate(0, i -> i+1)
//		      .filter(index -> map.values().stream().anyMatch(a -> a.contains(index)))
//		      .findFirst().get();
//		System.out.println(lastIndex);
//		      .peek(System.out::println)
//		      .mapToObj(index1 -> map.forEach((k,v) -> {if(v.contains(index)) {return k;}} ))
//		      .collect(Collectors.toList());
}
