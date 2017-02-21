package zadaci_21_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;

		System.out.println("Palindrome prime numbers: \n");
		// Ispisuje brojeva koji ispunjavaju uslove dok ne bude ispisano ukupno
		// 100 brojeva
		while (sum < 100) {
			// ispis brojeva za koje vrijedi da je i broj i inverzija broja:
			// palindrom i prost broj
			if (isPalindrome(number)) {
				if (isPrime(number) && isPrime(reverse(number))) {
					System.out.printf("%-6d", number);
					sum++;
					// Ukoliko je ispisano 10 brojeva prelazi u novi red
					if (sum % 10 == 0)
						System.out.println();
				}
			}
			number++;

		}

	}

	public static boolean isPalindrome(int number) {
		if (number < 0)
			return false;
		// ukoliko je uneseni broj jednak svojoj inverziji onda je on palindrom,
		// vraca true
		if (number == reverse(number))
			return true;
		else
			return false;
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
