package zadaci_25_02_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];

		System.out.println("Enter a 3-by-4 matrix, interval[-1000,1000]: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = InputDoubleNumber.inputNumber(input, -1000, 1000);
			}
		}

		input.close();

		for (int j = 0; j < matrix[0].length; j++) {
			System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];

		}
		return sum;
	}

}
