package part10.exercise09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Exercise 9:   (4) Modify innerclasses/Sequence.java so that Sequence works
 * with an Iterator instead of a Selector.
 * 
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
  public Sequence(int size) { items = new ArrayList<Object>(size); }
  public void add(Object x) {
    items.add(x);
  }

	private class SequenceSelector /* implements Selector */ {
    /*private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
    */
  }	
  
	public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
//    Selector selector = sequence.selector();
    Iterator<Object> iterator = sequence.items.iterator();
    while(iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
//      iterator.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
