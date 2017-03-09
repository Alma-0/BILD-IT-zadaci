package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter 10 integer numbers");
		for (int i = 0; i < 10; i++) {
			list.add(InputSingleNumber.inputNumber(input));
		}
		
		// removeDuplicate(list);
		ArrayList<Integer> list1 = removeDuplic(list);
		
		System.out.println("List without duplicates");
		// list.forEach(System.out::println);
		list1.forEach(System.out::println);

	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		// for (int i = 0; i < list.size(); i++)
		// for (int j = i + 1; j < list.size(); j++) {
		// if (list.get(i) == list.get(j)) {
		// list.remove(list.get(j));
		// j--;
		// }
		// }

	}

	public static ArrayList<Integer> removeDuplic(ArrayList<Integer> list) {

		List<Integer> listWithDuplicates = list;
		List<Integer> listWithoutDuplicates = listWithDuplicates.parallelStream().distinct()
				.collect(Collectors.toList());
		return (ArrayList<Integer>) listWithoutDuplicates;
	}

}
