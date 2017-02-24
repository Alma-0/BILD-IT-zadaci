package zadaci_23_02_2017;

import userInput.InputLongNumber;
import java.util.Scanner;


public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli trocifren broj, interval [100, 999]");
		long number = InputLongNumber.inputNumber(input, 100,999);
		System.out.println("Broj je palindrom: " + (number == reverse(number)));
		input.close();

	}

	public static int reverse(long number) {
		int result = 0;
		// novi broj koji predstavlja inverzni broj unesenog
		while (number != 0) {
			result = result * 10;
			result += (number % 10);
			number /= 10;
		}
		return result;
	}

}
