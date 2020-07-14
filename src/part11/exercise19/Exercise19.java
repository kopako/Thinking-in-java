package part11.exercise19;
// The task was not understood
/**
 * Exercise 19:   (2) Repair the problem in LostMessage.java by guarding the 
 * call in the finally clause.
 * @author kopan.dmytro
 *
 */

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

public class Exercise19 {
void f() throws VeryImportantException {
  throw new VeryImportantException();
}
void dispose() throws HoHumException {
  throw new HoHumException();
}
public static void main(String[] args) {
		try {
			Exercise19 lm = new Exercise19();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch (Exception e) {
//			throw new Exception();
		}
	}
}