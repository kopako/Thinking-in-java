package part12.exercise20;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Exercise 20:   (2) Create a class that contains int, long, float and double 
 * and String fields. Create a constructor for this class that takes a single 
 * String argument, and scans that string into the various fields. Add a 
 * toString( ) method and demonstrate that your class works correctly.
 * @author kopan.dmytro
 *
 */
public class Exercise20 {
	private int i;
	private long l;
	private float f;
	private double d;
	private String string;

	public Exercise20(String allFields) {
		Scanner sc = new Scanner(allFields);
//		sc.useDelimiter(Pattern.compile("\\s+"));
		this.i = Integer.parseInt(sc.findInLine("\\d+(?![LDFldf])"));
		this.l = Long.parseLong(sc.findInLine("\\d+(?=[Ll])"));
		this.f = Float.parseFloat(sc.findInLine("\\d+\\.?\\d*(?=[Ff])"));
		this.d = Double.parseDouble(sc.findInLine("\\d+\\.?\\d*(?=[Dd])"));
		this.string = sc.findInLine("\\w+");
		
	}

	@Override
	public String toString() {
		return "Exercise20 [i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", string=" + string + "]";
	}

	public static void main(String[] args) {
		System.out.println(new Exercise20("1 12l 12.3f 3245.345d awefras"));
	}
}
