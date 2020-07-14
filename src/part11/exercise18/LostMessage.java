package part11.exercise18;
//: exceptions/LostMessage.java
// How an exception can be lost.
/**
 * Exercise 18:   (3) Add a second level of exception loss to LostMessage.java 
 * so that the HoHumException is itself replaced by a third exception. 
 * @author kopan.dmytro
 *
 */
class VeryImportantException extends Exception {
  public String toString() {
    return "A very important exception!";
  }
}

class HoHumException extends Exception {
  public String toString() {
    return "A trivial exception";
  }
}

public class LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dispose() throws HoHumException {
    throw new HoHumException();
  }
  public static void main(String[] args) {
    try {
		try {
		  LostMessage lm = new LostMessage();
		  try {
		    lm.f();
		  } finally {
		    lm.dispose();
		  }
		} catch(Exception e) {
		  throw new Exception();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}