package zadaci_10_03_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one binary number: ");
		String binaryString = input.next();

		bin2Dec(binaryString);
		input.close();
	}

	public static void bin2Dec(String binaryString) {

		try {
			System.out.println(
					"Decimal representation of number " + binaryString + " is " + Integer.parseInt(binaryString, 2));
		} catch (NumberFormatException ex) {
			System.out.println("Number is not binary");
		}

	}

}
