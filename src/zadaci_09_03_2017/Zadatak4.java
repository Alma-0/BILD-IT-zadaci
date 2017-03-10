package zadaci_09_03_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
        System.out.println("Enter index of number");
		int index = InputSingleNumber.inputNumber(input);

		try {
			System.out.println("The element of the array is: " + array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nOut of Bounds");
		}

	}

}
