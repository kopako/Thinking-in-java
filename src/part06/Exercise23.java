package part06;

import static net.mindview.util.Print.print;

/**
 * Exercise 23:   (2) Prove that class loading takes place only once. 
 * Prove that loading may be caused by either the creation of the first 
 * instance of that class or by the access of a static member. 
 * 
 * Exercise 24:   (2) In Beetle.java, inherit a specific type of beetle
 * from class Beetle, following the same format as the existing classes. 
 * Trace and explain the output. 
 * 
 * @author kopan.dmytro
 *
 */
class Exercise23 extends Beetle{

	Exercise23(){
		System.out.println("Exercise23 constructor");
	}
	
	public static void main(String[] args) {
		    print("Beetle constructor");
		    Beetle b1 = new Beetle();
		    Exercise23 ex = new Exercise23();
		    
	}
	 
}


class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    print("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 =
    printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    print(s);
    return 47;
  }
}

class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");
  public Beetle() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle.x2 initialized");
 
}