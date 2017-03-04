package zadaci_21_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 2;
		// Radnja se nastavlja dok ne bude ispisano 100 brojeva
		while (sum < 100) {
			// ispis broja ukoliko je jedinstven i ukoliko je njegova inverzija
			// takodjer jedinstven broj
			if (isPrime(number) && isPrime(reverse(number))) {
				System.out.printf("%-5d", number);
				sum++;
				if (sum % 10 == 0)
					System.out.println();
			}
			number++;
		}

	}

	public static int reverse(int number) {
		int result = 0;
		// novi broj koji predstavlja inverzni broj unesenog
		while (number != 0) {
			result = result * 10;
			result += (number % 10);
			number /= 10;
		}
		return result;
	}

	public static boolean isPrime(int num) {
		// Broj je prost broj ukoliko je djeljiv sa 1 i sa samim sobom
		// Ukoliko je prost broj vraca true, ukoliko nije vraca false
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
