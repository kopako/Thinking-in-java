package part09.exercise24;
//: innerclasses/GreenhouseController.java
// Configure and execute the greenhouse system.
// {Args: 5000}

/**
 * Exercise 24:   (2) In GreenhouseControls.java, add Event inner classes that 
 * turn fans on and off. Configure GreenhouseController.java to use these new 
 * Event objects. 
 */
import part09.exercise24.controller.*;

public class GreenhouseController {
  public static void main(String[] args) {
    GreenhouseControls gc = new GreenhouseControls();
    Exercise25 ex = new Exercise25();
    // Instead of hard-wiring, you could parse
    // configuration information from a text file here:
    gc.addEvent(gc.new Bell(900));
    
    Event[] eventList = {
      gc.new ThermostatNight(0),
      gc.new LightOn(200),
      gc.new LightOff(400),
      gc.new WaterOn(600),
      gc.new WaterOff(800),
      gc.new ThermostatDay(1400),
      gc.new FansOn(10),
      gc.new FansOff(30),
      ex.new WaterMistGeneratorOn(1800),
      ex.new WaterMistGeneratorOff(2000)
    };	
    gc.addEvent(gc.new Restart(2000, eventList));
    if(args.length == 1)
      gc.addEvent(
        new GreenhouseControls.Terminate(
          new Integer(args[0])));
    gc.run();
  }
} /* Output:
Bing!
Thermostat on night setting
Light is on
Light is off
Greenhouse water is on
Greenhouse water is off
Thermostat on day setting
Restarting system
Terminating
*///:~
