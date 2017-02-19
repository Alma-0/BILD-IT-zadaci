package zadaci_18_02_2017;

import java.util.Scanner;

import userInput.InputLongNumber;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of minutes");
		long minutes = InputLongNumber.inputNumber(input, 0);
		// Ukupan broj minuta u godini
		long minutesInYear = 365 * 24 * 60;
		// broj godina u unesenom broju minuta
		long years = minutes / minutesInYear;
		long days = (minutes % minutesInYear) / 1440;
		// ispis rezultata
		System.out.println(minutes + " is " + years + " years and " + days + " days.");

	}

}
