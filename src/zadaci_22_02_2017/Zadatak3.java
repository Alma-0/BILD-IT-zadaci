package zadaci_22_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		double sum = 0;
		// Racunanje sume razlomaka neparnih brojeva od 1 do 97
		for (double i = 1; i <= 97; i += 2) {
			sum += i / (i + 2);
		}
		// Ispis sume razlomaka
		System.out.printf("Suma iznosi %4.2f", sum);

	}

}
