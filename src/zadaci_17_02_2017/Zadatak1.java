package zadaci_17_02_2017;

import java.util.Scanner;
import userInput.InputSingleNumber;

public class Zadatak1 {

	public static void main(String[] args) {
		InputSingleNumber number = new InputSingleNumber();
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			num1 = number.inputNumber(input, 0);
			System.out.println("Enter second numbers");
			num2 = number.inputNumber(input, 0);
			int temp;
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
		}

		for (int i = num1; i <= num2; i++) {
			System.out.println(i + ". year has " + numberOfDayInAYear(i) + " days.");
		}

	}

	public static int numberOfDayInAYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return 366;
		else
			return 365;

	}

}
