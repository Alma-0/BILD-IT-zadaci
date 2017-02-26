package zadaci_25_02_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broje clanova niza, interval [1,1000]");
		int count = InputSingleNumber.inputNumber(input, 1, 1000);
		int[] array = new int[count];
		System.out.println("Unesite "+count+" clanova niza, interval[-1000,1000]");
		
		for(int i=0;i<array.length;i++){
			array[i]=InputSingleNumber.inputNumber(input, -1000, 1000);
		}
		if (isConsecutiveFour(array)) {
			System.out.println("\nLista sadrzi 4 ista broja zaredom");
		} else {
			System.out.println("\nLista ne sadrzi 4 ista broja zaredom");
}

	}

	public static boolean isConsecutiveFour(int[] values) {

		boolean isFour = false;

		for (int i = 0; i < (values.length - 3); i++) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
				return true;
			}

		}
		return isFour;
	}
}
