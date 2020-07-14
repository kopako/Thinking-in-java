package part10.exercise17;

import java.util.*;

/**
 * Exercise 17:   (2) Take the Gerbil class in Exercise 1 and put it into a Map 
 * instead, associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String 
 * (the key) for each Gerbil (the value) you put in the table. Get an Iterator 
 * for the keySet( ) and use it to move through the Map, looking up the Gerbil 
 * for each key and printing out the key and telling the Gerbil to hop( ). 
 * 
 * Exercise 1:   (2) Create a new class called Gerbil with an int gerbilNumber
 * that’s initialized in the constructor. Give it a method called hop( ) that
 * displays which gerbil number this is, and that it’s hopping. Create an
 * ArrayList and add Gerbil objects to the List. Now use the get( ) method to
 * move through the List and call hop( ) for each Gerbil.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise17 {
	public static void main(String[] args) {
		Map<String, Gerbil> gerbils = new HashMap<>();
		gerbils.put("Fuzzy",new Gerbil(1));
		gerbils.put("Spot",new Gerbil(2));
			
		Iterator<String> it = gerbils.keySet().iterator();
		while(it.hasNext()) {
			gerbils.get(it.next()).hop();
		}
	}
}
class Gerbil {
	private int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop() {
		System.out.println(this + System.lineSeparator()+ "It's hopping");
	}
	
	@Override
	public String toString() {
		return "Gerbill [gerbilNumber=" + gerbilNumber + "]";
	}
	
	
}
