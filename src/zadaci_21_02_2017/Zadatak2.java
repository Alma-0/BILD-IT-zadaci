package zadaci_21_02_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos cijelog broja
		System.out.println("Enter one integer number");
		int number = InputSingleNumber.inputNumber(input);
		// Poziv metode
		reverse(number);

	}

	public static void reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			// Mnozenje prethodnog broja sa 10 i sabiranje sa novim
			// jednocifrenim brojem
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		// Ispis reverznog broja
		System.out.println("Reverse of entered number is " + reverse);

	}

}
