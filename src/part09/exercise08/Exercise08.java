package part09.exercise08;

/**
 * Exercise 8:   (2) Determine whether an outer class has access to the private 
 * elements of its inner class.
 * @author kopan.dmytro
 *
 */
class Exercise08 {

	void changeInnerField() {
		Inner inner = this.new Inner();
		inner.innerField += 1;
		System.out.println(inner.innerField);
	}
	
	class Inner {
		private int innerField = 10;
	}
	
	public static void main(String[] args) {
		Exercise08 ex = new Exercise08();
		ex.changeInnerField();
		ex.changeInnerField();
	}
}
