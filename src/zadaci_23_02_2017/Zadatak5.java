package zadaci_23_02_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova piramide, unintervalu [1,100]");
		int dim = InputSingleNumber.inputNumber(input, 1, 100);
		for (int i = 1; i <= dim; i++) {
			for (int j = dim; j > 0; j--)
				if (j > i)
					System.out.print("   ");
				else
					System.out.printf("%3d", j);
			for (int z = 2; z <= i; z++)
				System.out.printf("%3d", z);
			System.out.println();
		}

	}

}
