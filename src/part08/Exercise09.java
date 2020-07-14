package part08;

import static net.mindview.util.Print.print;

/**
 * Exercise 9:   (3) Refactor Musics.java by moving the common methods in Wind, 
 * Percussion and Stringed into an abstract class. 
 * Exercise 10:   (3) Modify Musics.java by adding a Playable interface. Move the 
 * play( ) declaration from Instrument to Playable. Add Playable to the derived 
 * classes by including it in the implement s list. Change tune( ) so that it 
 * takes a Playable instead of an Instrument.
 * 
 * @author kopan.dmytro
 *
 */
// Since there is no Musics.java class in src I will implement it as I've understood

abstract class Instrument{
	  
	  int VALUE = 5;

	  abstract void adjust();
}

interface Playable {
	void play(Note n);
}

class Wind extends Instrument implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Wind"; }
  public void adjust() { print(this + ".adjust()"); }
}

class Percussion extends Instrument implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Percussion"; }
  public void adjust() { print(this + ".adjust()"); }
}

class Stringed extends Instrument implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Stringed"; }
  public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
  public String toString() { return "Brass"; }
}	

class Woodwind extends Wind {
  public String toString() { return "Woodwind"; }
}

class Music5 {
  // Doesn't care about type, so new types
  // added to the system still work right:
}
	  
 class Exercise09 {
  static void tune(Playable i) {
		    i.play(Note.MIDDLE_C);
		  }
		  static void tuneAll(Playable[] e) {
		    for(Playable i : e)
		      tune(i);
		  }

  public static void main(String[] args) {
	    // Upcasting during addition to the array:
	  Playable[] orchestra = {
	      new Wind(),
	      new Percussion(),
	      new Stringed(),
	      new Brass(),
	      new Woodwind()
	    };
	    tuneAll(orchestra);
  }
}
