package week2_project;

import java.util.Scanner;

import userInput.InputLongNumber;

public class CreditCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Ispis poruke
		System.out.println("Enter a credit card number as a long integer:");
		// Unos broja (tipa long)
		long creditCardID = InputLongNumber.inputNumber(input, 0);
		// Pozivanje metode, ispis da li je kartica validna
		System.out.println("Credit Card is valid: " + isValid(creditCardID));

	}

	// Metoda za provjeru validnosti kartice
	public static boolean isValid(long number) {

		int result = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		// Provjera broja cifri kartice
		if (!checkSize(number))
			return false;
		// Provjera prefixa kartice
		if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
				|| prefixMatched(number, 6)) {
			if (result % 10 == 0)
				return true;

		}
		return false;

	}

	// Metoda koja vraca sumu brojeva na parnim pozicijama (s desna ka lijevo)
	public static int sumOfDoubleEvenPlace(long number) {
		int sumEven = 0;
		// Broj koji je proslijedjen metodi pretvara u string
		String strCard = number + "";
		for (int i = strCard.length() - 2; i >= 0; i -= 2) {
			int result = Integer.parseInt(strCard.charAt(i) + "") * 2;
			sumEven += getDigit(result);
		}
		// Vraca sumu
		return sumEven;

	}

	public static int getDigit(int number) {
		// Ukoliko je broj jednocifren vraca broj
		if (number < 10)
			return number;
		else
			// Ukoliko broj nije jednocifren, vraca sumu cifara broja
			return ((number / 10) + number % 10);

	}

	public static int sumOfOddPlace(long number) {
		int sumOdd = 0;
		// Uneseni broj pretvara u string
		String strCard = number + "";
		// Sabiranje brojeva na neparnim pozicijama (s desna ka lijevo)
		for (int i = strCard.length() - 1; i >= 0; i -= 2) {
			sumOdd += Integer.parseInt(strCard.charAt(i) + "");
		}
		// Vraca sumu
		return sumOdd;

	}

	public static boolean prefixMatched(long number, int d) {
		String str = number + "";
		String str1 = d + "";
		// Provjera da li je primljeni argument d prefix broja number
		if (str1.equals(str.substring(0, str1.length())))
			return true;
		else
			return false;

	}

	public static int getSize(long d) {
		String result = d + "";
		// Vraca broj cifara kartice
		return result.length();

	}

	public static boolean checkSize(long number) {
		if (getSize(number) < 13 || getSize(number) > 16)
			// Kartica mora imati broj cifri u intervalu [13,16] ukoliko broj
			// nije u tom intervalu kartica nije validna, vraca false
			return false;
		else
			// Ukoliko je broj cifara ispravan vraca true
			return true;
	}

	public static long getPrefix(long number, int k) {
		String number1 = number + "";
		String k1 = k + "";
		String sum = "";
		if (number1.length() < k1.length())
			return number;
		else {
			for (int i = 0; i < k; i++)
				sum += number1.charAt(i);
			// Metoda vraca k (uneseni argument) cifara unesenog broja number
			return Integer.parseInt(sum);
		}
	}
}
