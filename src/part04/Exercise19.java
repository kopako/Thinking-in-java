package part04;

import java.util.Arrays;

class Exercise19 {


	static void method1(String... strings) {
		Arrays.stream(strings).forEach(System.out::println);
	}
	public static void main(String... args) {
		//19
		method1("arg1", "arg2", "arg3");
		method1(new String[] {"array ", "of ","strings"});
		//20
		if(args.length>0) {
			Arrays.stream(args).forEach(System.out::println);
		}
	}

}
