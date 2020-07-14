//: polymorphism/music3/Music3.java
// An extensible program.
package part07.music3;

import part07.music.Note;
import static net.mindview.util.Print.*;

import java.util.Random;

/**
 * Exercise 6:   (1) Change Music3.java so that what( ) becomes the root Object 
 * method toString( ). Try printing the Instrument objects using 
 * System.out.println( ) (without any casting). 
 * 
 * Exercise 7:   (2) Add a new type of Instrument to Music3.java and verify that 
 * polymorphism works for your new type. 
 * 
 * Exercise 8:   (2) Modify Music3.java so that it randomly creates Instrument
 * objects the way Shapes.java does. 
 * 
 * @author kopan.dmytro
 *
 */
class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  String what() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
  @Override
  public String toString() { return what(); }
  
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  String what() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  String what() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  String what() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}

// Exercise07
class Flute extends Instrument {
	void play(Note n) { print("Flute.play() " + n); }
	  String what() { return "Flute"; }
	  void adjust() { print("Adjusting Flute"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  String what() { return "Woodwind"; }
}	

public class Music3 {

  public static void tune(Instrument i) {

  i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }	
  
  //Exercise08
  class RandomInstrumentGenerator {
	  private Random rand = new Random(48);
	  public Instrument next() {
	    switch(rand.nextInt(4)) {
	      default:
	      case 0: return new Wind();
	      case 1: return new Percussion();
	      case 2: return new Stringed();
	      case 3: return new Flute();
	    }
	  }
  }
  public static void main(String[] args) {
    // Upcasting during addition to the array:
    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };
    tuneAll(orchestra);
    
    //Exercise06
    for (Instrument instrument : orchestra) {
		System.out.println(instrument);
	}
  }
}