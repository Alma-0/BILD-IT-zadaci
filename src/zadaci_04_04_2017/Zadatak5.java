package zadaci_04_04_2017;

import java.util.Arrays;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[8];
		System.out.println("Enter 8 integer numbers");
		for (int i = 0; i < 8; i++)
			array[i] = InputSingleNumber.inputNumber(input);
		System.out.println("The largest number in array is:" + largestNumber(array, array[array.length - 1]));

	}

	public static int largestNumber(int[] array, int max) {
		int length = array.length;
		if (array.length == 1) {
			if (array[0] > max)
				return array[0];
			else
				return max;
		}

		else {
			if (array[array.length - 2] > max)
				max = array[array.length - 2];
			array = Arrays.copyOfRange(array, 0, length - 1);
			return largestNumber(array, max);

		}

	}

}
