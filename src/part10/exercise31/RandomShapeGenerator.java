//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package part10.exercise31;
import java.util.*;

/**
 * Exercise 31:   (3) Modify polymorphism/shape/RandomShapeGenerator.java to 
 * make it Iterable. You’ll need to add a constructor that takes the number 
 * of elements that you want the iterator to produce before stopping. Verify 
 * that it works.
 * @author kopan.dmytro
 *
 */
public class RandomShapeGenerator implements Iterable<Shape>{
	private Shape[] shapes;
	public RandomShapeGenerator(int range) {
		shapes = new Shape[range];
		for(int i = 0; i < range; i++)
			shapes[i] = next();
	}
	
	private Random rand = new Random(47);
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
  	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;
			public boolean hasNext() {
				return index < shapes.length;
			}
			public Shape next() {
				return shapes[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}			
		};
	}
  	public static void main(String[] args) {
		RandomShapeGenerator rsg = new RandomShapeGenerator(10);
		for (Shape shape : rsg) {
			System.out.println(shape);
		}
	}
} ///:~
