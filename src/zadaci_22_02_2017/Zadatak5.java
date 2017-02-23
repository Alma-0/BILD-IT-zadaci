package zadaci_22_02_2017;

import userInput.InputSingleNumber;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ispis poruke. Unos dimenzije kvadratne matrice
		System.out.println("Unesi broj redova kvadratne matrice, broj treba biti u intervalu [1,100]");
		// Unos broja veceg od nule
		int number = InputSingleNumber.inputNumber(input, 1,100);
		System.out.println("Matrica: ");
		printMatrix(number);

	}

	public static void printMatrix(int n) {
		// ispis kvadratne matrice dimenzije n
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

}
