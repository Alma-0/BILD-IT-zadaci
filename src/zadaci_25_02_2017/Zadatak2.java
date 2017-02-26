package zadaci_25_02_2017;

import java.util.Scanner;
import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite 10 cijelih brojeva za koje ne zelite da budu u nizu, interval [1,54] ");
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = InputSingleNumber.inputNumber(input, 1, 54);
		}

		input.close();

		System.out.println("\nRandom brojevi su ");

		int counter = 0;

		for (int i = 0; i < 100; i++) {
			System.out.print(getRandom(numbers) + " ");
			counter++;

			if (counter == 20) {
				System.out.println();
				counter = 0;
			}
		}

	}

	public static int getRandom(int... numbers) {
		int rNumber = 0;
		boolean proces = true;

		while (proces) {
			rNumber = (int) (Math.random() * 54 + 1);
			proces = false;

			for (int i = 0; i < numbers.length; i++) {
				if (rNumber == numbers[i]) {
					proces = true;
				}
			}
		}

		return rNumber;

	}

}
