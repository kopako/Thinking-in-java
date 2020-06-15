package part01;

/*
Exercise 1:   (2) Create a class containing an int and a char that are 
 not initialized, and print their values to verify that Java performs
 default initialization.  
 */
class Exercise1 {

	private int a;
	private String text;
	private boolean isBoolean;
	public static char charType;
	private long longType;
	private double doubleType;
	private short shortType;
	private byte byteType;
	private float floatType;
	//private void voidType;

	
	@Override
	public String toString() {
		return "Exercise1 [a=" + a + ", text=" + text + ", isBoolean=" + isBoolean + ", charType=" + charType
				+ ", longType=" + longType + ", doubleType=" + doubleType + ", shortType=" + shortType + ", byteType="
				+ byteType + ", floatType=" + floatType + "]";
	}


	public static void main(String[] args) {
		System.out.println(new Exercise1());
		System.out.println("char" + ((int)charType+"]"));
	}

}
