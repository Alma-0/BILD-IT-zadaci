package zadaci_18_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {

		int count = 0;
		System.out.println("Prime numbers are:");
		// Ispis prostih brojeva u intervalu [2,1000]
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
				// Ukoliko je ispisano 8 brojeva u jednom redu, prelazi u
				// sljedeci red
				if (count % 8 == 0)
					System.out.println();
			}
		}

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
