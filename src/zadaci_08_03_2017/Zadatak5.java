package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		

		System.out.println(" Enter five integers for list1");
		for (int i = 0; i < 5; i++) {
			list1.add(InputSingleNumber.inputNumber(input));
		}
		System.out.println(" Enter five integers for list12");
		for (int i = 0; i < 5; i++) {
			list2.add(InputSingleNumber.inputNumber(input));
		}
		
		ArrayList<Integer> resultList = union(list1, list2);
		
		resultList.forEach(System.out::println);
		
		

	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.addAll(list1);
		list.addAll(list2);
		return list;

	}

}
