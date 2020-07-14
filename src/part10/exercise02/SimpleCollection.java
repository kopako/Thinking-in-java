package part10.exercise02;

import java.util.*;

/**
 * Exercise 2:   (1) Modify SimpleCollection.java to use a Set for c. 
 * 
 * @author kopan.dmytro
 *
 */
public class SimpleCollection {
  public static void main(String[] args) {
    Set<Integer> c = new HashSet<>();
    for(int i = 0; i < 10; i++)
      c.add(i); // Autoboxing
    for(Integer i : c)
      System.out.print(i + ", ");
  }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
