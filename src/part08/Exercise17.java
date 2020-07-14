package part08;

/**
 * Exercise 17:   (2) Prove that the fields in an interface are implicitly static and final. 
 * @author kopan.dmytro
 *
 */
public class Exercise17 implements I17_2{
	public static void main(String[] args) {
		I17_2 i = new Exercise17();
		System.out.println(i.FIELD);
//		i.FIELD += 1; //!The final field I17_1.FIELD cannot be assigned
	}
}


interface I17_1{
	int FIELD = 3301;
}

interface I17_2 extends I17_1{
	
}