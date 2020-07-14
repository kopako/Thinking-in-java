package part07;
//: polymorphism/PolyConstructors.java // Constructors and polymorphism // don’t produce what you might expect. 
import static net.mindview.util.Print.*; 

/**
 * Exercise 15:   (2) Add a RectangularGlyph to PolyConstructors.java and 
 * demonstrate the problem described in this section. 
 * @param args
 */
class Glyph {
	void draw() { print("Glyph.draw()"); }   
	Glyph() {    
		print("Glyph() before draw()");
		draw();     
		print("Glyph() after draw()");  
	} }  

class RoundGlyph extends Glyph {   
	private int radius = 1;   
	RoundGlyph(int r) {     
		radius = r;     
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}   
	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	} 
}  

class RectangularGlyph extends Glyph {
	private int side = 1;
	RectangularGlyph(int side) {
		this.side = side;
		print("RectangularGlyph.RectangularGlyph(), side = " + side);
	}
	
	void draw() {
		print("RectangularGlyph.draw(), side = " + side);
	} 
}

public class PolyConstructors {   
	public static void main(String[] args) { 
		new RoundGlyph(5);   
		new RectangularGlyph(8);
	} 
}