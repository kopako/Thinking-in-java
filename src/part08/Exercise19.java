package part08;

import java.util.Random;

/**
 * Exercise 19:   (3) Create a framework using Factory Methods that performs both
 * coin tossing and dice tossing. 
 * @author kopan.dmytro
 *
 */
public class Exercise19 {

	static Tossing consumeTossing(TossingFactory factory) {
		return factory.getTossing();
	}
	
	public static void main(String[] args) {
		consumeTossing(new CoinTossingFactory()).toss();
		consumeTossing(new DiceTossingFactory()).toss();
	}
}

interface Tossing{
	void toss();
}

class CoinTossing implements Tossing {

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

class DiceTossingFactory implements TossingFactory{

	@Override
	public Tossing getTossing() {
			return new DiceTossing();
	}
	
}

class CoinTossingFactory implements TossingFactory{
	
	@Override
	public Tossing getTossing() {
		return new CoinTossing();
	}
	
}

