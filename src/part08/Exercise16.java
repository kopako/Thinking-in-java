package part08;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Exercise 16:   (3) Create a class that produces a sequence of chars. 
 * Adapt this class so that it can be an input to a Scanner object. 
 * @author kopan.dmytro
 *
 */
public class Exercise16 implements Readable{

	private int count;
	
	public Exercise16(int count) {
		super();
		this.count = count;
	}

	@Override
	public int read(CharBuffer var1) throws IOException {
		var1.append(IntStream.range(32, 32 + count) // readable characters starts on 32 by ascii
		         .mapToObj(a ->  "" + (char)a)
		         .collect(Collectors.joining()));
		return -1;
	}
	public static void main(String[] args) {
		
	Scanner s = new Scanner(new Exercise16(126-31));
    while(s.hasNext())
      System.out.println(s.next());
	}

}
