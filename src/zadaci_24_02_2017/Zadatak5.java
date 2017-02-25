package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Unesite 10 cijelih brojeva,interval [0,100]");
		for (int i = 0; i < 10; i++) {
			int number=InputSingleNumber.inputNumber(input,0,100);
			if(!list.contains(number))
			list.add(number);
		}
		System.out.printf("Uneseno je %d jedinstvenih brojeva, a to su: ",list.size());
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i)+" ");
	}

}
