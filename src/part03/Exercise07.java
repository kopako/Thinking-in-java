package part03;


/**
 * Exercise 7:   (1) Modify Exercise 1 so that the program exits by using the 
 * break keyword at value 99. Try using return instead.
 * @author kopan.dmytro
 *
 */
class Exercise07 {
	public static void main(String[] args) {
		int i = 0;
		for(;true;) {
			System.out.println(i+=1);
			if (i == 100) break;
		}
	}
}
