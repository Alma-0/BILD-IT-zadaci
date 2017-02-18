package zadaci_17_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Brojac
		int count = 0;
		System.out.println("Twin primes");
		// Ispis brojeva koji su twin primes brojeva do 1000
		// Prosti brojevi su veci od 1
		for (int i = 2; i <= 10000; i++) {
			// Twin primes su parovi brojeva, medjusobno se razlikuju za broj 2
			// i prosti su brojevi
			if (isPrime(i) && isPrime(i + 2)) {
				count++;
				System.out.printf("(%d %d)", i, i + 2);
				// Ukoliko je ispisano 10 brojeva u redu, prelazi u novi red
				if (count % 10 == 0)
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
