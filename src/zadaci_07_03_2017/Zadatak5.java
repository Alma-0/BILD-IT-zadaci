package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			System.out.println("Enter a integer number, input ending with 0");
			int number = InputSingleNumber.inputNumber(input);
			if (number == 0)
				break;
			else
				list.add(number);
		}
		shuffle(list);
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

	}

	public static void shuffle(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			int index = (int) (Math.random() * list.size());

			int temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}

	}

}
