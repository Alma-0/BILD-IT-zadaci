package zadaci_27_02_2017;

import java.util.Scanner;
import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows (interval [1,20])");
		int rowNum = InputSingleNumber.inputNumber(input, 1, 20);

		int[][] matrix1 = new int[rowNum][2];

		for (int row = 0; row < rowNum; row++) {
			for (int column = 0; column < 2; column++) {
				matrix1[row][column] = (int) (Math.random() * 9);
				System.out.print(matrix1[row][column] + " ");

			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Sorted array");
		sort(matrix1);

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}

			System.out.println();
		}
		input.close();

	}

	public static void sort(int m[][]) {
		for (int i = 0; i < m.length - 1; i++) {
			int minRow = m[i][0];
			int minCol = m[i][1];
			int minIndex = i;

			for (int j = i + 1; j < m.length; j++) {
				if (minRow > m[j][0]) {
					minRow = m[j][0];
					minCol = m[j][1];
					minIndex = j;
				} else if (minRow == m[j][0] && minCol > m[j][1]) {
					minRow = m[j][0];
					minCol = m[j][1];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				m[minIndex][0] = m[i][0];
				m[i][0] = minRow;
				m[minIndex][1] = m[i][1];
				m[i][1] = minCol;
			}
		}
	}
}