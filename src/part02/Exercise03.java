package part02;
 /**
  * TODO 3:   (1) Create a class containing a float 
  *  and use it to demonstrate aliasing during method calls.
  * @author kopan.dmytro
  *
  */
class Exercise03 {

	static class MethodAlais {
		static void f(AliasClass ac) {
			ac.field = 1234F;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AliasClass ac = new AliasClass(321F);
		MethodAlais.f(ac);
		System.out.println(ac);
		
	}

}
