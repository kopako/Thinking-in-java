package part01;

/*
 * Exercise 10:   (2) Write a program that prints three arguments taken 
 * from the command line. To do this, you’ll need to index into 
 * the command-line array of Strings.  
*/
class Exercise10 {

	public static void main(String[] args) {
		if(args.length>=3) {
			StringBuilder sb = new StringBuilder("{");
			for (int i = 0; i < args.length; i++) {
				sb.append("\"arg"+i+"\":%s");
				if(i!= args.length-1) sb.append(",");
			}
			sb.append("}");
			System.out.printf(sb.toString(),args);
		} else {
			throw new IndexOutOfBoundsException("Arguments length should be at least 3");
		}
	}
}
