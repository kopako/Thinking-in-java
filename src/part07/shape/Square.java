//: polymorphism/shape/Square.java
package part07.shape;
import static net.mindview.util.Print.*;

public class Square extends Shape {
	@Override
	public void draw() { print("Square.draw()"); }
	@Override
	public void erase() { print("Square.erase()"); }
} ///:~
