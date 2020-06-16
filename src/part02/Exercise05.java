package part02;
/**
 * Exercise 5:   (2) Create a class called Dog containing two Strings: name and
 * says. In main( ), create two dog objects with names “spot” (who says,
 * “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and 
 * what they say.
 * Exercise 6:   (3) Following Exercise 5, create a new Dog reference and 
 * assign it to spot’s object. Test for comparison using == and equals( ) for all
 * references.
 *   
 * @author kopan.dmytro
 *
 */
class Exercise05 {
	public static void main(String[] args) {
		Dog spot = new Dog("spot","Ruff!");
		Dog scruffy = new Dog("scruffy","Wurf!");
		Dog aliasDog = scruffy;
		Dog scruffy2 = new Dog("scruffy","Wurf!");
		
		System.out.println(spot);
		System.out.println(scruffy);
		
		
		
		System.out.println(spot == scruffy);
		System.out.println(scruffy == aliasDog);
		System.out.println(scruffy.equals(aliasDog));
		System.out.println(scruffy.equals(scruffy2));
		System.out.println(scruffy == scruffy2);
	}
}

class Dog{
	String name;
	String says;
	
	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((says == null) ? 0 : says.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (says == null) {
			if (other.says != null)
				return false;
		} else if (!says.equals(other.says))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", says=" + says + "]";
	}
	
	
}