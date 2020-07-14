package part12.exercise06;

/**
 * Exercise 6:   (2) Create a class that contains int, long, float and double 
 * fields. Create a toString( ) method for this class that uses String.format( ), 
 * and demonstrate that your class works correctly. 
 * @author kopan.dmytro
 *
 */
public class Exercise06 {

	private int i;
	private long l;
	private float f;
	private double d;
	
	
	public Exercise06(int i, long l, float f, double d) {
		super();
		this.i = i;
		this.l = l;
		this.f = f;
		this.d = d;
	}

	@Override
	public String toString() {
		return String.format("Exercise06 [%1$d, %2$d %3$f %4$f]", i, l, f, d);
	}
	
	public static void main(String[] args) {
		System.out.println(new Exercise06(11,12L, 132.45F,1234D));
	}
	
}
