package part10.exercise07;

import java.util.*;

/**
 * Exercise 7:   (3) Create a class, then make an initialized array of objects 
 * of your class. Fill a List from your array. Create a subset of your List by 
 * using subList( ), then remove this subset from your List.
 * @author kopan.dmytro
 *
 */
class Exercise07 {
	public static void main(String[] args) {
		Exercise07[] exercises = {new Exercise07(),new Exercise07(),new Exercise07(),new Exercise07()};
		List<Exercise07> exList = new ArrayList<>();
		for (Exercise07 exercise07 : exercises) {
			exList.add(exercise07);
		}
		List<Exercise07> subList = exList.subList(1, 3);
		System.out.println(subList);
	}

}
