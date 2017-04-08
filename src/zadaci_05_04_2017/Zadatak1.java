package zadaci_05_04_2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import userInput.InputSingleNumber;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter 10 integer numbers");
		for (int i = 0; i < 10; i++) {
			list.add(InputSingleNumber.inputNumber(input));
		}

		ArrayList<Integer> list1 = removeDuplicates(list);
		System.out.println("List without duplicates");
		list1.forEach(System.out::println);

	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		List<E> listWithDuplicates = list;
		List<E> listWithoutDuplicates = listWithDuplicates.parallelStream().distinct().collect(Collectors.toList());
		return (ArrayList<E>) listWithoutDuplicates;

	}

}
