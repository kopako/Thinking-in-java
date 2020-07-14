package part08;


/**
 * Exercise 11:   (4) Create a class with a method that takes a String argument
 * and produces a result that swaps each pair of characters in that argument. 
 * Adapt the class so that it works with interfaceprocessor.Apply.process( ).
 * @author kopan.dmytro
 *
 */
public class Exercise11 implements Processor{

	@Override
	public String name() {
		return getClass().getSimpleName();
	}

	@Override
	public Object process(Object input) {
		char[] chars = ((String)input).toCharArray();
		for (int i = 0; i < chars.length - 1; i+=2) {
			chars[i] = (char) ((chars[i] + chars[i+1]) - (chars[i+1]= chars[i]));
		}
		return String.valueOf(chars);
	}

	public static void main(String[] args) {
		Apply.process(new Exerise11(), "1abcdefgh");
	}
}
