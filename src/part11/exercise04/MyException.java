package part11.exercise04;

public class MyException extends Exception {

	String msg;
	public MyException() {
		super();
	}

	public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	void printMsg() {
		System.out.println(msg);
	}
	
}
