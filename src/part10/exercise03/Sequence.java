package part10.exercise03;

import java.util.*;

/**
 * Exercise 3:   (2) Modify innerclasses/Sequence.java so that you can add any
 * number of elements to it.
 * 
 * Exercise 22:   (2) Implement reverseSelector( ) in Sequence.java. 
 * @author kopan.dmytro
 *
 */
interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence {
  private List<Object> items;
  private int next = 0;
  public Sequence() { items = new ArrayList(); }
  public void add(Object x) {
    items.add(x);
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public Object current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
  }
  
  public Selector selector() {
    return new SequenceSelector();
  }
  
  public Selector reverseSelector() {
	  return new Selector() {
		  private int i = items.size()-1;
		  public boolean end() { return i == -1; }
		  public Object current() { return items.get(i); }
		  public void next() { if(i >=0) i-=1; }
	  };
  }
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.reverseSelector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
