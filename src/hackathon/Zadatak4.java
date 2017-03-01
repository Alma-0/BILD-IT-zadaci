package hackathon;

import userInput.InputSingleNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite kolicinu novca (cijeli broj), interval[0,10000]");
		int coins = InputSingleNumber.inputNumber(input, 1, 10000);

		while (coins - 5 >= 0) {
			list.add(5);
			coins -= 5;
		}
		while (coins - 3 >= 0) {
			list.add(3);
			coins -= 3;
		}
		while (coins > 0) {
			list.add(1);
			coins--;
		}
		System.out.print(list.size() + "(");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.print(")");

	}

}
