package part09.exercise13;

/**
 * Exercise 13:   (1) Repeat Exercise 9 using an anonymous inner class. 
 * 
 * Exercise 9:   (1) Create an interface with at least one method, and implement 
 * that interface by defining an inner class within a method, which returns
 * a reference to your interface.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise13 {
	// 13
	Interface getInterface09() {
		return new Interface(){
			@Override
			public void todo() {}
		};
	}
	// 10
	Interface getInterface10(boolean b) {
		if(b) {
			class InterfaceImpl implements Interface{
				@Override
				public void todo() {}
			}
			return new InterfaceImpl();
		}
		return null;
	}
	
	Interface interface3() {
		return this.new Inner();
	}

	private class Inner	implements Interface{

		@Override
		public void todo() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}


interface Interface {
	void todo();
}
