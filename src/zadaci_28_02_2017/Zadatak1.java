package zadaci_28_02_2017;

import java.util.Arrays;
import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] array = new double[3][3];
		System.out.println("Unesite vrijednosti matrice dimenzija 3X3 (double vrijednosti u intervalu[-1000,1000])");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				array[row][col] = InputDoubleNumber.inputNumber(input, -1000, 1000);
			}
		}
		sortRows(array);
		System.out.println("\nSortiran niz\n");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] sortRows(double[][] m) {
		for (int row = 0; row < m.length; row++) {
			Arrays.sort(m[row]);
		}
		return m;
	}

}