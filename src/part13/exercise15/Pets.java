package part13.exercise15;
import java.util.*;

import typeinfo.pets.*;

public class Pets {
	public static final PetCreator creator = new RegisteredFabricsPetCreatorImpl();

	public static Pet randomPet() {
		return creator.randomPet();
	}

	public static Pet[] createArray(int size) {
		return creator.createArray(size);
	}

	public static ArrayList<Pet> arrayList(int size) {
		return creator.arrayList(size);
	}
}
