package part10.exercise04;


import java.io.*;
import java.nio.file.*;
import java.util.*;


/**
 * Exercise 4:   (3) Create a generator class that produces character names (as
 * String objects) from your favorite movie (you can use Snow White or Star
 * Wars as a fallback) each time you call next( ), and loops around to the
 * beginning of the character list when it runs out of names. Use this
 * generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
 * LinkedHashSet, and a TreeSet, then print each container.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise04 {

	public static void main(String[] args) throws IOException {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		for (int i = 0; i < 10; i++) {
			arrayList.add(Generator.next());	
			linkedList.add(Generator.next());
			hashSet.add(Generator.next());
			linkedHashSet.add(Generator.next());
			treeSet.add(Generator.next());
		}
		System.out.println(arrayList);
		System.out.println(linkedList);
		System.out.println(hashSet);
		System.out.println(linkedHashSet);
		System.out.println(treeSet);
		
	}

}

class Generator {
	private static List<String> characters = new ArrayList<>();
	private static int index = 0;
	
	static {
		Collections.addAll(characters, 
				"Obi-Wan Kenobi", 
				"Master Joda", 
				"Luke Skywalker",
				"Padme",
				"captain Solo",
				"Dart Wader",
				"Enakin Skywalker");
	}
	
	public static String next() {
		if (index == characters.size()) index = 0;
		return characters.get(index++);
	}
}