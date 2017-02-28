package zadaci_27_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];
		int[] countRow = new int[4];
		int[] countColumn = new int[4];

		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
				countRow[row] += matrix[row][column];
				countColumn[column] += matrix[row][column];
			}
		}

		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++)
				System.out.print(matrix[row][column] + " ");
			System.out.println();
		}

		System.out.println("The largest row index: " + max(countRow));
		System.out.println("The largest column index: " + max(countColumn));

	}

	public static int max(int[] array) {
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		return maxIndex;

	}

}
