package part09.exercise09;

/**
 * Exercise 9:   (1) Create an interface with at least one method, and implement 
 * that interface by defining an inner class within a method, which returns
 * a reference to your interface.
 * @author kopan.dmytro
 *
 */
class Exercise09 {
	// 09
	Interface getInterface09() {
		class InterfaceImpl implements Interface{
			@Override
			public void todo() {}
		}
		return new InterfaceImpl();
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
