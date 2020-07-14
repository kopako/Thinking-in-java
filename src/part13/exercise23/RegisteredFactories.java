package part13.exercise23;


import typeinfo.Operation;


import typeinfo.factory.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

import net.mindview.util.Null;

/**
 * Exercise 24:   (4) Add Null Objects to RegisteredFactories.java. 
 * @author kopan.dmytro
 *
 */
class Part {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories =
			new ArrayList<Factory<? extends Part>>();	
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random(47);
	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}	

class NullPart {
	public static Part
	newNullPart(Class<? extends Part> type) {
		return (Part)Proxy.newProxyInstance(
				NullPart.class.getClassLoader(),
				new Class[]{ Null.class, Part.class },
				new NullPartProxyHandler(type));
	}	
}

class NullPartProxyHandler implements InvocationHandler {
	private String nullName;
	private Part proxied = new NPart();
	NullPartProxyHandler(Class<? extends Part> type) {
		nullName = type.getSimpleName() + " NullPart";
	}
	private class NPart extends Part implements Null {
		public String name() { return nullName; }
		public String model() { return nullName; }
		public List<Operation> operations() {
			return Collections.emptyList();
		}
	}	
	public Object
	invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(proxied, args);
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
		for(int i = 0; i < 10; i++)
			System.out.println(Part.createRandom());
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
