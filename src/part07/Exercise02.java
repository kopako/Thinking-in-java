package part07;

import java.util.stream.IntStream;

import part07.shape.RandomShapeGenerator;

/**
 * Exercise 2:   (1) Add the @Override annotation to the shapes example. 
 * 
 * Exercise 3:   (1) Add a new method in the base class of Shapes.java that 
 * prints a message, but don’t override it in the derived classes. Explain 
 * what happens. Now override it in one of the derived classes but not the 
 * others, and see what happens. Finally, override it in all the derived 
 * classes. 
 * 
 * Exercise 4:   (2) Add a new type of Shape to Shapes.java and verify in 
 * main( ) that polymorphism works for your new type as it does in the 
 * old types.
 * 
 * @author kopan.dmytro
 *
 */
public class Exercise02 {

	public static void main(String[] args) {
		RandomShapeGenerator generator = new RandomShapeGenerator();
		IntStream.range(0, 10)
		         .mapToObj(a -> generator.next())
		         .forEach(b -> b.draw());
		IntStream.range(0, 10)
        .mapToObj(a -> generator.next())
        .forEach(b -> b.printMessage());
	}
}
