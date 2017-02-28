package zadaci_27_02_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		
		System.out.println("Enter matrix1 (3x3, interval[-100,100])");
		for (int row = 0; row < 3; row++)
			for (int column = 0; column < 3; column++)
				a[row][column] = InputDoubleNumber.inputNumber(input, -100, 100);
		
		System.out.println("Enter matrix2 (3x3, interval[-100,100])");
		for (int row = 0; row < 3; row++)
			for (int column = 0; column < 3; column++)
				b[row][column] = InputDoubleNumber.inputNumber(input, -100, 100);
		
		double[][]c=multiplyMatrix(a,b);
		
		System.out.println("Multiply matrix is");
		for (int row = 0; row < 3; row++){
			for (int column = 0; column < 3; column++)
				System.out.print(c[row][column]+" ");
		System.out.println();}
		

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				c[row][column] = 0;
				for (int k = 0; k < 3; k++)
					c[row][column] += a[row][k] * b[k][column];

			}
		}
		return c;
	}

}
