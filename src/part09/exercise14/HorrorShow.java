package part09.exercise14;

/**
 * Exercise 14:   (1) Modify interfaces/HorrorShow.java to implement
 * DangerousMonster and Vampire using anonymous classes.
 * @author kopan.dmytro
 *
 */
interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {}
	public void destroy() {}
}	

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {}
	public void destroy() {}
	public void kill() {}
	public void drinkBlood() {}
}	

public class HorrorShow {
	static void u(Monster b) { b.menace(); }
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) { l.kill(); }
	public static void main(String[] args) {

		// 14
		DangerousMonster dragonZilla = new DangerousMonster() {
			@Override
			public void menace() {}
			
			@Override
			public void destroy() {}
		};
		
		Vampire veryBadVampire = new Vampire() {
			
			@Override
			public void kill() {}
			
			@Override
			public void menace() {}
			
			@Override
			public void destroy() {}
			
			@Override
			public void drinkBlood() {}
		};
		
//		DangerousMonster barney = new DragonZilla();
//		u(barney);
//		v(barney);
//		Vampire vlad = new VeryBadVampire();
//		u(vlad);
//		v(vlad);
//		w(vlad);
	}
} 
