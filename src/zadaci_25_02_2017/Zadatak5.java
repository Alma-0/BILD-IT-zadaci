package zadaci_25_02_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Interval of numbers [-1000,1000]");
		System.out.println("Enter matrix1: (3x3)");

		double[][] matrix1 = new double[3][3];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = InputDoubleNumber.inputNumber(input, -1000, 1000);
			}
		}

		System.out.println("Enter matrix2: (3x3)");

		double[][] matrix2 = new double[3][3];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = InputDoubleNumber.inputNumber(input, -1000, 1000);
			}
		}

		input.close();

		double[][] matrix3 = addMatrix(matrix1, matrix2);

		System.out.println("\nmatrix1 + matrix2 is: ");

		for (double[] e : matrix3) {
			for (double f : e) {
				System.out.print(f + " ");
			}
			System.out.println();
		}

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] array = new double[a.length][a[0].length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = a[i][j] + b[i][j];
			}
		}

		return array;
	}

}
