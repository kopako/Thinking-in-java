package part09.exercise23;

/**
 * Exercise 23:   (4) Create an interface U with three methods. Create a class 
 * A with a method that produces a reference to a U by building an anonymous 
 * inner class. Create a second class B that contains an array of U. B should 
 * have one method that accepts and stores a reference to a U in the array, 
 * a second method that sets a reference in the array (specified by the method 
 * argument) to null, and a third method that moves through the array and calls 
 * the methods in U. In main( ), create a group of A objects and a single B. 
 * Fill the B with U references produced by the A objects. Use the B to call 
 * back into all the A objects. Remove some of the U references from the B. 
 * 
 * @author kopan.dmytro
 *
 */
class Exercise23 {
	public static void main(String[] args) {

		U[] arrU = new U[5];
		B b = new B();
		for (int i = 0; i < 5; i+=1) {
			arrU[i] = new A().createU();
		}
		b.arr = arrU;
		b.executeArr();
		b.deleteArrAtIndex(1);
		b.executeArr();
		
	}
}

interface U {
	void uMethod1();
	void uMethod2();
	void uMethod3();
}

class A {
	U createU() {
		return new U() {
			@Override
			public void uMethod3() {System.out.println("method3");}
			@Override
			public void uMethod2() {System.out.println("method2");}
			@Override
			public void uMethod1() {System.out.println("method1");}
		};
	}
}

class B {
	// would be easier with collection
	U[] arr;
	
	void setArrAtIndex(int index, U object) {
		//TODO throw an OutOf Bound exception in method
		if (isValidIndex(index)) {
			this.arr[index] = object;
		} else {
			System.out.println("Index is Out of Bound");
		}
	}
	
	void deleteArrAtIndex(int index) {
		if (isValidIndex(index)) {
			this.arr[index] = null;
		}
	}
	
	void executeArr() {
		for (int i = 0; i < this.arr.length; i++) {
			if(this.arr[i] != null) {
				arr[i].uMethod1();
				arr[i].uMethod2();
				arr[i].uMethod3();
			}
		}
	}
	
	private boolean isValidIndex(int index) {
		return (index>= 0 && index < this.arr.length);
	}
}