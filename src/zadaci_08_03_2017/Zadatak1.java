package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the array size n:");
		int sizeMatrix = InputSingleNumber.inputNumber(input);

		int[][] array = new int[sizeMatrix][sizeMatrix];

		System.out.println("The random array is: \n");
		for (int row = 0; row < sizeMatrix; row++) {
			for (int col = 0; col < sizeMatrix; col++) {
				System.out.print((array[row][col] = (int) (Math.random() * 2))+" ");
			}
			System.out.println();
		}
		ArrayList<Integer> largestRowsInd = largestIndexRow(array);
		ArrayList<Integer> largestColInd = largestIndexCol(array);

		System.out.println("The largest row index: ");
		largestRowsInd.forEach(System.out::println);

		System.out.println("The largest column index: ");
		largestColInd.forEach(System.out::println);

	}

	public static ArrayList<Integer> largestIndexRow(int[][] matrix) {

		ArrayList<Integer> listRow = new ArrayList<>();

		int[] countRows = new int[matrix.length];

		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix.length; col++) {
				countRows[row] += matrix[row][col];
			}
		int maxRow = countRows[0];

		for (int i = 1; i < countRows.length; i++) {
			if (countRows[i] > maxRow)
				maxRow = countRows[i];
					}

		for (int i = 0; i < countRows.length; i++) {
			if (countRows[i] == maxRow)
				listRow.add(i);
		}
	
		

		return listRow;
	}

	public static ArrayList<Integer> largestIndexCol(int[][] matrix) {

		ArrayList<Integer> listCol = new ArrayList<>();
		int[] countCol = new int[matrix.length];

		for (int col = 0; col < matrix.length; col++)
			for (int row = 0; row < matrix.length; row++) {
				countCol[col] += matrix[row][col];
			}
		
		int maxColumn = countCol[0];
		
		for (int i = 1; i < countCol.length; i++) {
			if (countCol[i] > maxColumn)
				maxColumn = countCol[i];

		}
		
		for (int i = 0; i < countCol.length; i++) {
			
			if (countCol[i] == maxColumn)
				listCol.add(i);
		}
		return listCol;

	}
}
