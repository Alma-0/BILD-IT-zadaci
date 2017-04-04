package zadaci_04_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one positive integer number");
		int number = InputSingleNumber.inputNumber(input, 0);
		reverseDisplay(number);

	}

	public static void reverseDisplay(int number) {

		if (number / 10 == 0)
			System.out.println(number);

		else {
			System.out.print(number % 10);
			reverseDisplay(number / 10);
		}

	}

}
