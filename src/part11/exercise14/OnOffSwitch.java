package part11.exercise14;

/**
 * Exercise 14:   (2) Show that OnOffSwitch.java can fail by throwing a 
 * RuntimeException inside the try block. 
 * @author kopan.dmytro
 *
 */
public class OnOffSwitch {
  private static Switch sw = new Switch();
  public static void f()
  throws OnOffException1,OnOffException2 {}
  public static void main(String[] args) {
    try {
      sw.on();
      if(true)throw new RuntimeException();
      // Code that can throw exceptions...
      f();
      sw.off();
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
      sw.off();
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
      sw.off();
    } 
  }
} /* Output:
on
off
*///:~
