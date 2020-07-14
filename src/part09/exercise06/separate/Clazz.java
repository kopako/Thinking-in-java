package part09.exercise06.separate;

import part09.exercise06.own.Interface06;

public class Clazz {

	private String name;
	
	protected class Inner implements Interface06{
		
		public Inner() {}

		@Override
		public String getName() {
			return name;
		}
		
	}
}
