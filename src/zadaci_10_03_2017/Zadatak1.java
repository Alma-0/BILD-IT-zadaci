package zadaci_10_03_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one positive binary number: ");
		int binaryNum = InputSingleNumber.inputNumber(input, 0);

		bin2Dec(binaryNum);
		input.close();
	}

	public static void bin2Dec(int binaryNum) {

		try {
			System.out.println(
					"Decimal representation of number " + binaryNum + " is " + Integer.parseInt(binaryNum + "", 2));
		} catch (NumberFormatException ex) {
			System.out.println("Number is not binary");
		}

	}

}
