package zadaci_04_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one positive integer number");
		int number = InputSingleNumber.inputNumber(input, 0);
		System.out.println("Sum of digits is: "+sumDigits(number));

	}

	public static int sumDigits(long n) {
		if (n / 10 == 0)
			return (int) n;

		else {
			return (int)(n % 10 + sumDigits(n / 10));
		}
	}

}
