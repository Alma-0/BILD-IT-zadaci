package zadaci_09_03_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two integer numbers");
		int number1 = InputSingleNumber.inputNumber(input);
		int number2 = InputSingleNumber.inputNumber(input);

		System.out.println("The sum is: " + (number1 + number2));

	}

}
