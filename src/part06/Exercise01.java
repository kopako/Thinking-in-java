package part06;

/**
 * Exercise 1:   (2) Create a simple class. Inside a second class, define a 
 * reference to an object of the first class. Use lazy initialization to 
 * instantiate this object.
 * 
 * @author kopan.dmytro
 *
 */
class Exercise01 {

	private InnerClass ic;
	
	class InnerClass{

		@Override
		public String toString() {
			return "InnerClass []";
		}
		
	}
	
	
	@Override
	public String toString() {
		if (ic == null) {
			ic = new InnerClass();
		}
		return "Exercise01 [ic=" + ic + "]";
	}


	public static void main(String[] args) {
		Exercise01 ex = new Exercise01();
		System.out.println(ex);

	}

}
