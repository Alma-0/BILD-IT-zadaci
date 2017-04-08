package zadaci_05_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak2 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Integer [] list={1,2,3,4,5,6};
		System.out.println("Enter one integer number");
		int number=InputSingleNumber.inputNumber(input);
		
		if (linearSearch(list,number)!=-1)
			System.out.println("Number is at position "+linearSearch(list,number));
		else System.out.println("Number is not in the list");
	}
	


	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;

	}

}
