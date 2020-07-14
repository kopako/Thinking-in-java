package part11.exercise23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Exercise 23:   (4) Add a class with a dispose( ) method to the previous 
 * exercise. Modify FailingConstructor so that the constructor creates one of 
 * these disposable objects as a member object, after which the constructor 
 * might throw an exception, after which it creates a second disposable member 
 * object. Write code to properly guard against failure, and in main( ) verify 
 * that all possible failure situations are covered. 
 * @author kopan.dmytro
 *
 */
class Exercise23 {
	public static void main(String[] args) throws ParseException {
		FailingConstructor failingConstructor;
		try {
			failingConstructor = new FailingConstructor();
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
	
}

class DisposableObject {
	void dispose() {
		System.out.println("Dispose: " + this.getClass().getSimpleName());
	}
}