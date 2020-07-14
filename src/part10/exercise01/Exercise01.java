package part10.exercise01;

import java.util.*;

/**
 * Exercise 1:   (2) Create a new class called Gerbil with an int gerbilNumber
 * that’s initialized in the constructor. Give it a method called hop( ) that
 * displays which gerbil number this is, and that it’s hopping. Create an
 * ArrayList and add Gerbil objects to the List. Now use the get( ) method to
 * move through the List and call hop( ) for each Gerbil.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise01 {
	public static void main(String[] args) {
		List<Gerbil> gerbils = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil(i+1));
		}
		for (Gerbil gerbil : gerbils) {
			gerbil.hop();
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
