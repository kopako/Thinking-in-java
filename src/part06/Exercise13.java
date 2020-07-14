package part06;

class Ex13Root{
	void method() {
		System.out.println("method no args");
	}
	
	void method(String arg) {
		System.out.println("method String: " + arg);
	}
	
	void method(int i) {
		System.out.println("method integer: " + i);
	}
	
	void method(char c) { 
		System.out.println("method character: " + c);
	}
}

public class Exercise13 extends Ex13Root {

	void method(Ex13Root root) {
		System.out.println("overloaded method with Root");
	}
	public static void main(String[] args) {
		Exercise13 ex = new Exercise13();
		ex.method("whatev");
		ex.method('f');
		ex.method(3301);
		ex.method(new Ex13Root());
	}

}
