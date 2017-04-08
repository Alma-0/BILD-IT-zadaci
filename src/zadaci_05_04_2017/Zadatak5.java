package zadaci_05_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {

		Integer[] list = { 1, 2, 3, 4, 5 };

		Scanner input = new Scanner(System.in);

		System.out.println("Enter one integer number");
		int number = InputSingleNumber.inputNumber(input);

		if (binarySearch(list, number) < 0)
			System.out.println("Number is not in the list");
		else
			System.out.println("Number is at position " + binarySearch(list, number));

	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (key.compareTo(list[middle]) < 0)
				high = middle - 1;

			else if (key.compareTo(list[middle]) > 0)
				low = middle + 1;

			else
				return middle;
		}
		return -low - 1;
	}

}
