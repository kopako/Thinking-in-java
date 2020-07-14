//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package part10.exercise13.controller;
import java.util.*;

public class Controller {
  // A class from java.util to hold Event objects:
  private List<Event> eventList = new LinkedList<Event>();
  public void addEvent(Event c) { eventList.add(c); }
  public void run() {
    while(eventList.size() > 0) {
    	//13
    	Iterator<Event> it = eventList.listIterator();
    	while(it.hasNext()) {
    		if(it.next().ready()) {
              System.out.println(it.next());
              it.next().action();
              eventList.remove(it.next());
            }
    	}
    }
      // Exercise 13
//      for(Event e : eventList)
//        if(e.ready()) {
//          System.out.println(e);
//          e.action();
//          eventList.remove(e);
//        }
  }
} ///:~
