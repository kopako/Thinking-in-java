package part05.exercise05;

class Main {

	public static void main(String[] args) {
		AccessTest at = new AccessTest();
//		System.out.println(at.privateField);  //The field AccessTest.privateField is not visible
		System.out.println(at.protectedField);
		System.out.println(at.packageField); 
		System.out.println(at.publicField);
//		at.privateMethod(); //The method privateMethod() from the type AccessTest is not visible
		at.protectedMethod();
		at.packageMethod(); 
		at.publicMethod();
	}

}
