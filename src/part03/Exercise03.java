package part03;

import java.util.Random;

/**
 * Exercise 3:   (1) Modify Exercise 2 so that your code is surrounded 
 * by an “infinite” while loop. It will then run until you interrupt it 
 * from the keyboard (typically by pressing ControlC).
 *  
 * @author kopan.dmytro
 *
 */
class Exercise03 {

	public static void main(String[] args) {
		int[] ra = new Random().ints().limit(25).toArray();
		
//		same as while true with incrementing the "i"
//		for (int i = 0; ; i++) {
		int i =0;
		while(true) {
			System.out.println(classify(ra[i], ra[i+1]));
			i+=1;
		}
		
	}
	
	static String classify(int a, int b) {
		if (a>b) return "greater than";
		else if (a<b) return "less than";
		else if (a==b) return "equal";
		else return "NaN";
	}

}
