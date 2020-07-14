package part08;

/**
 * Exercise 18:   (2) Create a Cycle interface, with implementations Unicycle, 
 * Bicycle and Tricycle. Create factories for each type of Cycle, and code 
 * that uses these factories. 
 * @author kopan.dmytro
 *
 */
public class Exercise18 {
	static Cycle cycleConsumer(CycleFacory cycleFacory) {
		return cycleFacory.getCycle();
	}
	
	public static void main(String[] args) {
		System.out.println(cycleConsumer(new BicycleFactory()).getClass().getSimpleName());
		System.out.println(cycleConsumer(new UnicycleFactory()).getClass().getSimpleName());
		System.out.println(cycleConsumer(new TricycleFactory()).getClass().getSimpleName());
	}
}

interface Cycle{}

class Unicycle implements Cycle {}
class Bicycle implements Cycle {}
class Tricycle implements Cycle {}

interface CycleFacory {
	Cycle getCycle();
}

class BicycleFactory implements CycleFacory{

	@Override
	public Cycle getCycle() {
			return new Bicycle();
	}
	
}

class UnicycleFactory implements CycleFacory{
	
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
	
}

class TricycleFactory implements CycleFacory{
	
	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
	
}
