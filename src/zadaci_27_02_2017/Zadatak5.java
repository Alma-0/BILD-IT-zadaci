package zadaci_27_02_2017;

public class Zadatak5 {

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		int[] sumRow = new int[6];
		int[] sumCol = new int[6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
				sumRow[i] += matrix[i][j];
				sumCol[j] += matrix[i][j];
			}
			System.out.println();
		}
		for (int k = 0; k < 6; k++) {
			if (isEven(sumRow[k])) {
				if (sumRow[k] == 0)
					System.out.println("Row " + k + " does not contains 1s");
				else
					System.out.println("Row " + k + " have even number of 1s");
			} else
				System.out.println("Row " + k + " have odd number of 1s");
			if (isEven(sumCol[k])) {
				if (sumCol[k] == 0)
					System.out.println("Column " + k + " does not contains 1s");
				else

					System.out.println("Column " + k + " have even number of 1s");
			} else
				System.out.println("Column " + k + " have odd number of 1s");
			System.out.println();
		}

	}

	public static boolean isEven(int number) {
		if (number % 2 != 0) {
			return false;
		}

		return true;

	}

}
