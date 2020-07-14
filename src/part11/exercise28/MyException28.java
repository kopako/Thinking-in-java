package part11.exercise28;

@SuppressWarnings("serial")
public class MyException28 extends RuntimeException {

	String msg;
	public MyException28() {
		super();
	}

	public MyException28(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	void printMsg() {
		System.out.println(msg);
	}
	
}
