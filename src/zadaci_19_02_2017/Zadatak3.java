package zadaci_19_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Prime numbers are:\n");
		// Ispis prostih brojeva u intervalu [2,1000]
		for (int i = 2; i <= 100000; i++) {
			if (isPrime(i)==1) {
				System.out.print(i + " ");
				count++;
				// Ukoliko je ispisano 10 brojeva u jednom redu, prelazi u
				// sljedeci red, radi preglednijeg ispisa
				if (count % 10 == 0)
					System.out.println();
			}
		}
		

	}
	
	public static int isPrime(int num) {
		// Broj je prost broj ukoliko je djeljiv sa 1 i sa samim sobom
		// Ukoliko je prost broj vraca true, ukoliko nije vraca false
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return 1;

	}

}
