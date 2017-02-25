package zadaci_24_02_2017;

import java.util.Scanner;

import userInput.InputShortNumber;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pozitivan broj u intevalu [-32768,32767]");
		short number = InputShortNumber.inputNumber(input, -32768, 32767);
		System.out.printf("\nBinarna reprezentacija broja %d je %016d%n", number,
				(Long.parseLong(Integer.toString(number, 2))));

	}

}
