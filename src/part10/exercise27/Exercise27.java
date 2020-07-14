package part10.exercise27;

import java.util.*;

/**
 * Exercise 27:   (2) Write a class called Command that contains a String and 
 * has a method operation( ) that displays the String. Write a second class 
 * with a method that fills a Queue with Command objects and returns it. Pass 
 * the filled Queue to a method in a third class that consumes the objects in 
 * the Queue and calls their operation( ) methods. 
 * @author kopan.dmytro
 *
 */
public class Exercise27 {

}

class Command {
	private String name;
	
	void operation() {
		System.out.println(this.name);
	}
}

class CommandFiller{
	static Queue<Command> fillQueue(Queue<Command> queue, Command command) {
		queue.offer(command);
		return queue;
	}
}

class CommandConsumer{
	void consume(Queue<Command> queue) {
		queue.poll().operation();
	}
}

