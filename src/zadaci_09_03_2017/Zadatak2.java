package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an positive integer m: ");
		int m = InputSingleNumber.inputNumber(input,0);

		ArrayList<Integer> list = (ArrayList<Integer>) factors(m).mapToObj(i -> i).collect(Collectors.toList());

		removeDuplic(list);

		int n = list.stream().mapToInt(x -> x).reduce(1, Math::multiplyExact);

		System.out.println("The smallest number n for m*n to be perfect square is : " + (m * n));

	}

	public static IntStream factors(int num) {
		return IntStream.range(2, num).filter(x -> num % x == 0)
				.mapToObj(x -> IntStream.concat(IntStream.of(x), factors(num / x))).findFirst()
				.orElse(IntStream.of(num));
	}

	public static void removeDuplic(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++)
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					list.remove(i);
					j = i + 1;

				}

	}
}
