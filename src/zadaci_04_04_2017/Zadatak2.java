package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one string");
		String value = input.nextLine();
		System.out.println("Reverse string is: ");
		reverseDisplay(value);
		input.close();

	}

	public static void reverseDisplay(String value) {
		int length = value.length();
		if (length == 1)
			System.out.println(value);

		else {

			System.out.print(value.charAt(length - 1));
			reverseDisplay(value.substring(0, length - 1));

		}

	}


}
