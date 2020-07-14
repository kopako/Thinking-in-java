package part11.exercise24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Exercise 24: (3) Add a dispose( ) method to the FailingConstructor class and 
 * write code to properly use this class. 
 * @author kopan.dmytro
 *
 */
class Exercise24 {
	public static void main(String[] args) throws ParseException {
		FailingConstructor failingConstructor;
		try {
			failingConstructor = new FailingConstructor();
			// here we use failingConstructor 
			// if needed we can wrap the usage with try-catch-finally
			// and put dispose into finally
			failingConstructor.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

class FailingConstructor {
	DisposableObject disposableObject1;
	DisposableObject disposableObject2;
	
	public FailingConstructor() throws Exception {
		disposableObject1 = new DisposableObject();
		try {
			if(System.currentTimeMillis()>0)throw new Exception();
			disposableObject2 = new DisposableObject();
		} catch (Exception e) {
			disposableObject1.dispose();
			e.printStackTrace();
		}
	}

	public void dispose() {
		System.out.println("Dispose FailingConstructor");
	}
	
}

class DisposableObject {
	void dispose() {
		System.out.println("Dispose: " + this.getClass().getSimpleName());
	}
}