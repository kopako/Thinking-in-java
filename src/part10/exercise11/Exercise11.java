package part10.exercise11;

/**
 * Exercise 11:   (2) Write a method that uses an Iterator to step through a 
 * Collection and print the toString( ) of each object in the container. Fill 
 * all the different types of Collections with objects and apply your method 
 * to each container.
 */
import java.util.*;

class Exercise11 {

	private static final void printIterable(Iterator<?> it) {
		if (it != null){
			while(it.hasNext()) System.out.println(it.next());
		} else {
			System.out.println("Illegal argument exception");
		}
		
	}
	
	public static void main(String[] args) {
		List<Object> srcList = new ArrayList<>();
		srcList.add(new Exercise11());
		srcList.add("secondObject");
		srcList.add("secondObject");
		srcList.add(3301);
		
		
		LinkedList<Object> linkedList = new LinkedList<>(srcList);
		HashSet<Object> hashSet = new HashSet<>(srcList);
//		TreeSet should implement comparable interface, 
//		it would be hard to impl logic for different types.
//		TreeSet<Object> treeSet = new TreeSet<>(srcList);
		printIterable(srcList.iterator());
		printIterable(linkedList.iterator());
		printIterable(hashSet.iterator());
//		printIterable(treeSet.iterator());
		
	}
}
