package part11.exercise15;

import part11.exercise14.*;

/**
 * Exercise 15:   (2) Show that WithFinally.java doesn’t fail by throwing a 
 * RuntimeException inside the try block.
 * @author kopan.dmytro
 *
 */
public class WithFinally {
  static Switch sw = new Switch();
  public static void main(String[] args) {
    try {
      sw.on();
      if(true)throw new RuntimeException();
      // Code that can throw exceptions...
      OnOffSwitch.f();
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
    } finally {
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
