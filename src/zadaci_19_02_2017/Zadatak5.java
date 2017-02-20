package zadaci_19_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Niz koji ce sluziti za brojanje unesenih brojeva
		int[] array = new int[101];
		// Lista u kojoj ce biti uneseni brojevi
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			// unos podatka
			System.out.print("Enter one number, in interval [0,100], zero breaks array");
			int num = InputSingleNumber.inputNumber(input, 0, 100);
			// ukoliko je  uneseni broj 0, radnja se prekida
			if (num == 0)
				break;
			else {
				// ukoliko broj vec nije u listi dodajemo ga
				if (!list.contains(num)) {
					list.add(num);
				} 
				array[num]++;

			}

		}
		// Ispis rezultata
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Number " + list.get(i) + " -" + array[list.get(i)] + " times");
		}
		input.close();

	}

}
