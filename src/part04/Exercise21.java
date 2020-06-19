package part04;

/**
 * Exercise 21:   (1) Create an enum of the least-valuable six types of paper 
 * currency. Loop through the values( ) and print each value and its ordinal( ).  
 * Exercise 22:   (2) Write a switch statement for the enum in the previous 
 * example. For each case, output a description of that particular currency. 
 * @author kopan.dmytro
 *
 */
class Exercise21 {

	static enum PaperCurrency{
		FIVE_HUNDRED, GRAND, TWO_GRANDS, FIVE_GRANDS, TEN_GRANDS, TWENTY_GRANDS
	}
	PaperCurrency paperCurrency;
	
	
	public Exercise21(PaperCurrency paperCurrency) {
		super();
		this.paperCurrency = paperCurrency;
	}


	public static void main(String[] args) {
		for (PaperCurrency banknote : PaperCurrency.values()) {
			System.out.println(banknote + ", ordinal " + banknote.ordinal());
		}
		
		System.out.println("\tExercise22");
		Exercise21 ex = new Exercise21(PaperCurrency.GRAND);
		switch(ex.paperCurrency) {
			case FIVE_HUNDRED: System.out.println(500); break;
			case GRAND: System.out.println(1000); break;
			case TWO_GRANDS: System.out.println(2000); break;
			case FIVE_GRANDS: System.out.println(5000); break;
			case TEN_GRANDS: System.out.println(10_000); break;
			case TWENTY_GRANDS: System.out.println(20_000); break;
		}
	}

}
