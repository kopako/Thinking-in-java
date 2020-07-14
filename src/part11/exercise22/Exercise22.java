package part11.exercise22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Exercise 22:   (2) Create a class called FailingConstructor with a 
 * constructor that might fail partway through the construction process and throw 
 * an exception. In main( ), write code that properly guards against this failure.
 * @author kopan.dmytro
 *
 */
class Exercise22 {
	public static void main(String[] args) throws ParseException {
		try {
			new FailingConstructor();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}
}

class FailingConstructor {

	public FailingConstructor() throws UnsupportedOperationException {
		try {
			if(System.currentTimeMillis() > new SimpleDateFormat("yyyy-MM-dd").parse("2020-06-02").getTime()) 
				throw new UnsupportedOperationException();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}