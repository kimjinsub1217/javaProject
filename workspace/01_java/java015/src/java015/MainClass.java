package java015;

public class MainClass {

	public static void main(String[] args) {
		Eevee booster = new Booster();
		Eevee jolteon = new Jolteon();

		booster.attack();
		jolteon.attack();

	}

}

class Eevee {

	void attack() {// 박치기
		System.out.println("박치기~");
	}
}

class Booster extends Eevee {
	@Override
	void attack() {
		System.out.println("물기!");
	}

}

class Jolteon extends Eevee {
	@Override
	void attack() {
		System.out.println("할퀴기!");
	}
}
