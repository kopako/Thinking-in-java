package part09.exercise07;

/**
 * Exercise 7:   (2) Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and 
 * calls the outer-class method. In a second outer-class method, create an 
 * object of the inner class and call its method, then show the effect on the 
 * outer-class object.
 * @author kopan.dmytro
 *
 */
class Exercise07 {
	
	private int count;
	
	public Exercise07(int count) {
		this.count = count;
	}

	private int countdown()/* throws InterruptedException */{
//		Thread.sleep(1000);
		return count--;
	}
	
	void secondMethod() {
		this.new Inner().prolongCount(5);
		System.out.println("Second method");
		System.out.println("count = " + count);
		countdown();
	}
	
	class Inner{
		public void prolongCount(int secondsToProlong) {
			count += secondsToProlong;
		}
	}
	
	public static void main(String[] args) {
		Exercise07 ex = new Exercise07(10);

		ex.secondMethod();
		ex.secondMethod();
		ex.secondMethod();
		
		//		int c;
//		try {
//			while ((c = ex.countdown()) != 0){
//				System.out.println(c);
//				if (c == 5) {
//					ex.new Inner().prolongCount(3);
//				}
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
