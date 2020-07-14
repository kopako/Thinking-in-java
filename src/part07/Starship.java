package part07;

/**
 * Exercise 16:   (3) Following the example in Transmogrify.java, 
 * create a Starship class containing an AlertStatus reference that can indicate
 * three different states. Include methods to change the states. 
 * @author kopan.dmytro
 *
 */
public class Starship {
	AlertStatus alert = new Warning();
	
	void change() {
		if (this.alert instanceof FireAlarm) {
			this.alert = new NuclearAlarm();
		} else {
			this.alert = new FireAlarm();
		}
	}
	
	public static void main(String[] args) {
		Starship starship = new Starship();
		System.out.println(starship.alert);
		starship.change();
		System.out.println(starship.alert);
		starship.change();
		System.out.println(starship.alert);
	}
}

class AlertStatus{

	@Override
	public String toString() {
		return "AlertStatus [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

class Warning extends AlertStatus {
	String message = "WARNING";

	@Override
	public String toString() {
		return message;
	}
	
}

class FireAlarm extends AlertStatus {
	String message = "FIRE";
	
	@Override
	public String toString() {
		return message;
	}
}

class NuclearAlarm extends AlertStatus {
	String message = "NukeAlarm";
	
	@Override
	public String toString() {
		return message;
	}

}