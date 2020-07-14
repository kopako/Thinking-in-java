package part08;

/**
 * Exercise 14:   (2) 
 * 1 Create three interfaces, each with two methods. 
 * 2 Inherit a new interface that combines the three, adding a new method. 
 * 3 Create a class by implementing the new interface and also inheriting from a concrete class. 
 * 4 Now write four methods, each of which takes one of the four interfaces as an argument. 
 * 5 In main( ), create an object of your class and pass it to each of the methods.
 *   
 * Exercise 15:   (2) Modify the previous exercise by creating an abstract 
 * class and inheriting that into the derived class.
 * @author kopan.dmytro
 *
 */

//3
public class Exercise14 extends Ex14Subclass 
	implements Interface4 {
	
	//4
	static void method01(Interface4 instance) {	}
	//4
	static void method02(Interface4 instance) {	}
	//4
	static void method03(Interface4 instance) {	}
	//4
	static void method04(Interface4 instance) {	}
	
	public static void main(String[] args) {
		Exercise14 ex = new Exercise14();
		method01(ex);
		method02(ex);
		method03(ex);
		method04(ex);
		
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method7() {
		// TODO Auto-generated method stub
		
	}

}

//1
interface Interface1 {
	void method1();
	void method2();
}

//1
interface Interface2 {
	void method3();
	void method4();
}

//1
interface Interface3 {
	void method5();
	void method6();
}

//2
interface Interface4 extends Interface1, Interface2, Interface3 {
	void method7();
}

//Exercise15
abstract class Ex14Subclass {}