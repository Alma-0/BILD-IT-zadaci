package zadaci_18_02_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Brojac pozitivnih brojeva
		int countPoz = 0;
		// Brojac negativnih brojeva
		int countNeg = 0;
		int num = 0;
		// Suma unesenih brojeva
		double sum = 0;
		while (true) {
			System.out.println("Enter one number (enter '0' to exit the program)");
			num = InputSingleNumber.inputNumber(input);
			// Ukoliko je broj razlicit od nule
			// Dodavanje broja prethodnoj sumi, povecanje brojaca brojeva
			if (num != 0) {
				sum += num;
				if (num < 0)
					countNeg++;
				else
					countPoz++;
			} else break;

		}
		
		double average= sum / (countNeg + countPoz);
		// Ispis rezultata
		System.out.println(
				"The number of positive numbers is: " + countPoz + ". The number of negative numbers is: " + countNeg);
		System.out.println("Sum of numbers is " + sum + ", average of numbers is " + average);

		
	}

}
