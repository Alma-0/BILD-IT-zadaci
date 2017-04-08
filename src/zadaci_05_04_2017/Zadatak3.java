package zadaci_05_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Integer[] list = new Integer[10];

		System.out.println("Enter 10 integer numbers");
		for (int i = 0; i < 10; i++) {
			list[i] = InputSingleNumber.inputNumber(input);
		}

		System.out.println("Max value: " + max(list));
	}

	public static <E extends Comparable<E>> E max(E[] list) {
		E maxValue = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(maxValue) > 0)
				maxValue = list[i];
		}
		return maxValue;
	}

}
