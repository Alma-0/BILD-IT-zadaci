package zadaci_19_02_2017;

import userInput.InputSingleNumber;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos cijelih brojeva, pozitivnih
		System.out.println("Enter two integer numbers");
		int num1 = InputSingleNumber.inputNumber(input, 0);
		int num2 = InputSingleNumber.inputNumber(input, 0);
		// num1- manji broj, num2- veci broj
		if (num1 > num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		int min = 1;
		// Nalazenje najmanjeg zajednickog djelioca veceg od 1 
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				min = i;
				break;
			}
		}
		int max = 1;
		// Nalazenje najveceg zajednickog djelioca
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;

			}
		}
		// Ispis rezultata
		if (min == 1) {
			System.out.println("Lowest common divisor is : " + min + ", greatest common devisor is " + max);
		} else
			System.out.println(
					"Lowest common divisor is (higher than 1): " + min + ", greatest common devisor is " + max);

	}

}
