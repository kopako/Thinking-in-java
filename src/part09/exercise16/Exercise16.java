package part09.exercise16;

/**
 * Exercise 16:   (1) Modify the solution to Exercise 18 from the Interfaces 
 * chapter to use anonymous inner classes. 
 * 
 * Exercise 18:   (2) Create a Cycle interface, with implementations Unicycle, 
 * Bicycle and Tricycle. Create factories for each type of Cycle, and code 
 * that uses these factories. 
 * @author kopan.dmytro
 *
 */
class Exercise16 {
	
	public static void main(String[] args) {
		System.out.println(Unicycle.factory.getCycle());
		System.out.println(Bicycle.factory.getCycle());
		System.out.println(Tricycle.factory.getCycle());
	}
}

interface Cycle{}

class Unicycle implements Cycle {
	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}
class Bicycle implements Cycle {
	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}
class Tricycle implements Cycle {
	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}

interface CycleFactory {
	Cycle getCycle();
}
