package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter 5 integer numbers");
		for (int i = 0; i < 5; i++) {
			list.add(InputSingleNumber.inputNumber(input));
		}
		sort(list);

		list.forEach(System.out::println);

	}

	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

}
