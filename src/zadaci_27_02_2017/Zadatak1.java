package zadaci_27_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		int[][] workH = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		int[][] totalH = new int[workH.length][2];

		for (int i = 0; i < workH.length; i++) {
			int sumHours = 0;

			for (int j = 0; j < workH[0].length; j++) {
				sumHours += workH[i][j];
			}

			totalH[i][0] = i;
			totalH[i][1] = sumHours;
		}

		sortArray(totalH);

		System.out.println("\t\tSu\t M\t T\t W\t Th\t F\t Sa\t");
		for (int i = 0; i < workH.length; i++) {
			System.out.print("Employee " + i + "\t");
			for (int j = 0; j < workH[i].length; j++) {
				System.out.print(workH[i][j] + "\t ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = totalH.length - 1; i >= 0; i--) {
			System.out.println("Employee " + totalH[i][0] + "'s total hours is " + totalH[i][1]);
		}

	}

	public static void sortArray(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i][1];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j][1]) {
					currentMin = array[j][1];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex][1] = array[i][1];
				array[i][1] = currentMin;
				array[currentMinIndex][0] = array[i][0];
				array[i][0] = currentMinIndex;
			}
		}

	}

}
