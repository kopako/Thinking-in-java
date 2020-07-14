package part09.exercise17;

import java.util.Random;

/**
 * Exercise 17:   (1) Modify the solution to Exercise 19 from the Interfaces 
 * chapter to use anonymous inner classes. 
 * 
 * Exercise 19:   (3) Create a framework using Factory Methods that performs both
 * coin tossing and dice tossing. 
 * @author kopan.dmytro
 *
 */
class Exercise17 {

	public static void main(String[] args) {
		CoinTossing.factory.getTossing().toss();
		DiceTossing.factory.getTossing().toss();

	}
}

interface Tossing{
	void toss();
}

class CoinTossing implements Tossing {
	static TossingFactory factory = new TossingFactory() {
		@Override
		public Tossing getTossing() {
			return new CoinTossing();
		}
	}; 
	Random random = new Random();
	
	@Override
	public void toss() {
		int i = random.nextInt(2);
		System.out.println(i);
		if (i==1) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
		
	}
}

class DiceTossing implements Tossing {
	static TossingFactory factory = new TossingFactory() {
		@Override
		public Tossing getTossing() {
			return new DiceTossing();
		}
	}; 

	Random suits = new Random();
	Random value = new Random();
	@Override
	public void toss() {
		System.out.printf("%d of %d",value.nextInt(53),suits.nextInt(4));
	}
}


interface TossingFactory {
	Tossing getTossing();
}
