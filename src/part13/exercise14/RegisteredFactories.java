package part13.exercise14;


import java.util.*;

import net.mindview.util.TypeCounter;

/**
 * Exercise 13:   (3) Use TypeCounter with the RegisteredFactories.java example 
 * in this chapter.
 * @author kopan.dmytro
 *
 */
class Part {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Class<? extends Part>> partFactories =
			new ArrayList<>();	
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partFactories.add(FuelFilter.class);
		partFactories.add(AirFilter.class);
		partFactories.add(CabinAirFilter.class);
		partFactories.add(OilFilter.class);
		partFactories.add(FanBelt.class);
		partFactories.add(PowerSteeringBelt.class);
		partFactories.add(GeneratorBelt.class);
	}
	private static Random rand = new Random(47);
	public static Part createRandom() throws InstantiationException, IllegalAccessException {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).newInstance();
	}
}	

class Filter extends Part {}

class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	public static class Factory
	implements typeinfo.factory.Factory<FuelFilter> {
		public FuelFilter create() { return new FuelFilter(); }
	}
}

class AirFilter extends Filter {
	public static class Factory
	implements typeinfo.factory.Factory<AirFilter> {
		public AirFilter create() { return new AirFilter(); }
	}
}	

class CabinAirFilter extends Filter {
	public static class Factory
	implements typeinfo.factory.Factory<CabinAirFilter> {
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory
	implements typeinfo.factory.Factory<OilFilter> {
		public OilFilter create() { return new OilFilter(); }
	}
}	

class Belt extends Part {}

class FanBelt extends Belt {
	public static class Factory
	implements typeinfo.factory.Factory<FanBelt> {
		public FanBelt create() { return new FanBelt(); }
	}
}

class GeneratorBelt extends Belt {
	public static class Factory
	implements typeinfo.factory.Factory<GeneratorBelt> {
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}	

class PowerSteeringBelt extends Belt {
	public static class Factory
	implements typeinfo.factory.Factory<PowerSteeringBelt> {
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}	

public class RegisteredFactories {
	public static void main(String[] args) {
		TypeCounter typeCounter = new TypeCounter(Part.class);
		for(int i = 0; i < 10; i++) {
			Part createRandom;
			try {
				createRandom = Part.createRandom();
				System.out.println(createRandom);
				typeCounter.count(createRandom);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		System.out.println(typeCounter);
	}
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
 *///:~
