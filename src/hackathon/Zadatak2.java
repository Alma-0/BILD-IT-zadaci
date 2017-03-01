package hackathon;

public class Zadatak2 {

	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		int sum = 0;
		while (count < 1000) {
			if (isPrime(number)) {
				sum += number;
				count++;
			}
			number++;

		}
		System.out.println("Suma prvih 1000 prostih brojeva iznosi "+sum);

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
