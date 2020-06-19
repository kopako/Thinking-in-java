package part04;


/**
 * Exercise 5:   (2) Create a class called Dog with an overloaded 
 * bark( ) method. This method should be overloaded based on various 
 * primitive data types, and print different types of barking, howling, 
 * etc., depending on which overloaded version is called. Write a main( ) 
 * that calls all the different versions. 
 * 
 * Exercise 6:   (1) Modify the previous exercise so that two of the overloaded 
 * methods have two arguments (of two different types), but in reversed order 
 * relative to each other. Verify that this works. 
 * @author kopan.dmytro
 *
 */
class Exercise05 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.bark('c');
		dog.bark(Byte.MAX_VALUE);
		dog.bark(Short.MIN_VALUE);
		dog.bark(Integer.MAX_VALUE);
		dog.bark(Long.MAX_VALUE);
		dog.bark(Float.MAX_VALUE);
		dog.bark(Double.MAX_VALUE);
		dog.bark(true);
		dog.bark("arg1",1);
		dog.bark(2,"arg2");

	}
}

class Dog {
	public void bark(char arg) {
		System.out.println(Character.valueOf(arg).getClass().getName());
	}

	public void bark(byte arg) {
		System.out.println(Byte.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(short arg) {
		System.out.println(Short.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(int arg) {
		System.out.println(Integer.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(long arg) {
		System.out.println(Long.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(float arg) {
		System.out.println(Float.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(double arg) {
		System.out.println(Double.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(boolean arg) {
		System.out.println(Boolean.valueOf(arg).getClass().getName() + " " + arg);
	}

	public void bark(String arg1, int arg2) {
		System.out.println(
				arg1.getClass().getName() + " " + arg1 + " " + Integer.valueOf(arg2).getClass().getName() + " " + arg2);
	}

	public void bark(int arg2, String arg1) {
		this.bark(arg1, arg2);
	}
}