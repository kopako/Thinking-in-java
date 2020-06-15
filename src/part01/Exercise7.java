package part01;

/*
Exercise 7:   (1) Turn the Incrementable code fragments into a working program.  
Exercise 8:   (3) Write a program that demonstrates that, no matter how many
 objects you create of a particular class, there is only one instance of a 
 particular static field in that class.  

 */
class Exercise7 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new StaticTest();
		}
//		Incrementable.increment();
//		Incrementable.increment();
		System.out.println(StaticTest.i);
	}

}

class Incrementable {   
	static void increment() { StaticTest.i++; } 
} 

class StaticTest {
	static int i;
	StaticTest() {
		i++;
	}
}
