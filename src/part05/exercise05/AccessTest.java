package part05.exercise05;

public class AccessTest {

	private String privateField = "private field";
	protected String protectedField = "protected field";
	String packageField = "package field";
	public String publicField = "public field";
	
	private void privateMethod() {
		System.out.println("private method");
	}
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	void packageMethod() {
		System.out.println("package method");
	}
	public void publicMethod() {
		System.out.println("public method");
	}
		
}
