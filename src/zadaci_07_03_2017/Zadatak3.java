package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak3 {

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
		System.out.println("Max number is : " + max(list));

	}

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty())
			return null;
		Integer max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i))
				max = list.get(i);
		}
		return max;

	}


	

}
