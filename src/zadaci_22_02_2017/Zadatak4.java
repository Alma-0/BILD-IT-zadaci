package zadaci_22_02_2017;

import java.util.Scanner;
import userInput.InputLongNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Ispis poruke. Unos cijelog broja
		System.out.println("Input one number");
		long number = InputLongNumber.inputNumber(input);
		// Pozivanje metode, ispis sume cifara unesenog broja
		System.out.println("Sum of digits of number " + sumDigits(number));

	} 

	public static int sumDigits(long n) {
		//varijabli n dodjeljujemo apsolutnu vrijednost unesenog broja
		n=Math.abs(n);
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		//Vraca sumu cifara broja
		return sum;
	}

}
