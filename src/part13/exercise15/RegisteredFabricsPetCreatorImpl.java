package part13.exercise15;

import java.util.ArrayList;
import java.util.List;

import typeinfo.factory.Factory;
import typeinfo.pets.*;

/**
 * Exercise 15:   (4) Implement a new PetCreator using Registered Factories, 
 * and modify the Pets Facade so that it uses this one instead of the other two. 
 * Ensure that the rest of the examples that use Pets .Java still work correctly.
 * 
 * The entry point of current exercise in PetCount3.java and PetCount4.java 
 * @author kopan.dmytro
 *
 */
public class RegisteredFabricsPetCreatorImpl extends PetCreator{

	static List<Class<? extends Pet>> petFabrics = new ArrayList<>();
	static {
		petFabrics.add(Cat.class);
		petFabrics.add(Cymric.class);
		petFabrics.add(Dog.class);
		petFabrics.add(EgyptianMau.class);
		petFabrics.add(Gerbil.class);
		petFabrics.add(Hamster.class);
		petFabrics.add(Manx.class);
		petFabrics.add(Mouse.class);
		petFabrics.add(Mutt.class);
		petFabrics.add(Pug.class);
		petFabrics.add(Rat.class);
		petFabrics.add(Rodent.class);
	}
	@Override
	public List<Class<? extends Pet>> types() {
		return petFabrics;
	}

}
