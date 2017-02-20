package zadaci_19_02_2017;

import java.util.Arrays;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos podataka 
		System.out.println ("Enter two integer numbers");
		int num1 = InputSingleNumber.inputNumber(input);
		int num2 = InputSingleNumber.inputNumber(input);
		int num3 = InputSingleNumber.inputNumber(input);
		int[] sort1 = sort(num1, num2, num3);
		System.out.println("Sorted numbers: " + sort1[0] + "," + sort1[1] + "," + sort1[2]);

	}

	// nova metoda za sortiranje brojeva u nizu, od manjeg ka vecem
	public static int[] sort(int x, int y, int z) {
		int[] array = { x, y, z };
		Arrays.sort(array);
		return array;
	}

}
