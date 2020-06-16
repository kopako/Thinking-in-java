package part02;

/**
 * Exercise 2:   (1) Create a class containing a float and use it to demonstrate aliasing.
 * @author kopan.dmytro
 *
 */
class Exercise02 {

	public static void main(String[] args) {
		AliasClass ac1 = new AliasClass(123.45F);
		AliasClass ac2 = new AliasClass(321.45F);
		
		System.out.println(ac1);
		System.out.println(ac2);
		
		ac1 = ac2;
		ac1.field = 23.23F;
		
		System.out.println(ac1);
		System.out.println(ac2);
		
	}
}


class AliasClass {
	float field;
	
	public AliasClass(float field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "AliasClass [field=" + field + "]";
	}
	
}