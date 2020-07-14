package part13.exercise03;

import java.util.*;

/**
 * Exercise 3:   (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it 
 * to a Shape, then downcast it back to a Rhomboid. Try downcasting to a Circle 
 * and see what happens.
 * 
 * Exercise 4:   (2) Modify the previous exercise so that it uses instanceof 
 * to check the type before performing the downcast. 
 * 
 * Exercise 5:   (3) Implement a rotate(Shape) method in Shapes.java, such that 
 * it checks to see if it is rotating a Circle (and, if so, doesn’t perform the 
 * operation).
 * 
 * Exercise 6:   (4) Modify Shapes.java so that it can "highlight" (set a flag in) 
 * all shapes of a particular type. The toString( ) method for each derived 
 * Shape should indicate whether that Shape is "highlighted." 
 * 
 * @author kopan.dmytro
 *
 */
abstract class Shape {
	protected boolean rotatable;
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Rhomboid extends Shape {
	boolean highlited;
	public String toString() { return (highlited?"Highlited ":"")+"Rhomboid"; }

}

class Circle extends Shape {
	boolean highlited;
	public String toString() { return (highlited?"Highlited ":"")+"Circle"; }
}

class Square extends Shape {
	boolean highlited;
	public String toString() { return (highlited?"Highlited ":"")+"Square"; }
}

class Triangle extends Shape {
	boolean highlited;
	public String toString() { return (highlited?"Highlited ":"")+"Triangle"; }
}	

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(
				new Circle(), new Square(), new Triangle(), new Rhomboid()
				);
		for(Shape shape : shapeList) {
			shape.draw();
			highlite(shape);
			System.out.println(shape);
		}

		Shape rhomboid = new Rhomboid();
		if(rhomboid instanceof Rhomboid) rhomboid = (Rhomboid) rhomboid;
		if(rhomboid instanceof Circle) rhomboid = (Circle) rhomboid;
	}

	static boolean rotate(Shape shape) {
		return (shape instanceof Circle);
	}
	static void highlite(Shape shape) {
		if (shape instanceof Rhomboid) {
			((Rhomboid) shape).highlited = true;
		}
	}
}
