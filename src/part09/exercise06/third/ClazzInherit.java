package part09.exercise06.third;

import part09.exercise06.own.Interface06;
import part09.exercise06.separate.Clazz;

public class ClazzInherit extends Clazz{
	
	public Interface06 getInnerInherited() {
		return this.new Inner();
	}

}
