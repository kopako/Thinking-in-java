//: polymorphism/shape/Circle.java
package part07.shape;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  @Override
  public void erase() { print("Circle.erase()"); }
  @Override
  public void printMessage() {
	  System.out.println("Circle shape message");
  }
  
} ///:~
