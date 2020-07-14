package part06;


/**
 * Exercise 18:   (2) Create a class with a static final field and 
 * a final field and demonstrate the difference between the two. 
 * @author kopan.dmytro
 *
 */
class Exercise18 {

	static int count = 0;
	final int serial = count++;
	static final String COMPANY_NAME = "Capsys";
	
	
	@Override
	public String toString() {
		return "Exercise18 [serial=" + serial + "]";
	}

	public static void main(String[] args) {
		Exercise18 e1 = new Exercise18();
		Exercise18 e2 = new Exercise18();
		System.out.println(e1);
		System.out.println(e2);
	}

}
