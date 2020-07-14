package part09.exercise24;

import part09.exercise24.controller.Event;

/**
 * Exercise 25:   (3) Inherit from GreenhouseControls in GreenhouseControls.java 
 * to add Event inner classes that turn water mist generators on and off. 
 * Write a new version of GreenhouseController.java to use these new Event 
 * objects.
 * @author kopan.dmytro
 *
 */
public class Exercise25 extends GreenhouseControls{

	private boolean waterMistGenerator;
	public class WaterMistGeneratorOn extends Event {

		public WaterMistGeneratorOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			waterMistGenerator = true;
		}

		@Override
		public String toString() {
			return "WaterMistGeneratorOn";
		}
	}
	public class WaterMistGeneratorOff extends Event {
		
		public WaterMistGeneratorOff(long delayTime) {
			super(delayTime);
		}
		
		@Override
		public void action() {
			waterMistGenerator = false;
		}
		
		@Override
		public String toString() {
			return "WaterMistGeneratorOff";
		}
	}
}
