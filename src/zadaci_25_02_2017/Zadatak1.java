package zadaci_25_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int[] counts = new int[10];

		int count = 0;

		System.out.println("The random numbers are: ");

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = (int) (Math.random() * 10);
			count++;

			System.out.print(numbers[i] + " ");

			if (count % 10 == 0) {
				System.out.println();
			}

			counts[numbers[i]]++;
		}

		System.out.println();

		for (int i = 0; i < counts.length; i++) {
			System.out.println("The number of " + i + "s: " + counts[i]);
		}

	}

}
