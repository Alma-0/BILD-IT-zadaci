package zadaci_19_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		// Ispis 3 random velika slova
		for (int i = 0; i < 3; i++) {
			int num = (int) (Math.random() * 25 + 65); 
			System.out.print((char) num);
		}
		// Ispis crtice
		System.out.print("-");
		// Ispis 4 broja(interval[0,9])
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 10);
			System.out.print(num);
		}

	}

}
