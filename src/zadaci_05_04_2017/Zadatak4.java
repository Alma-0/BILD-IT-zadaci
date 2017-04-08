package zadaci_05_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak4 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Integer[][] list = new Integer[3][3];

		System.out.println("Enter 9 integer numbers");
		for (int i = 0; i < 3; i++) 
			for (int j=0;j<3;j++)
			list[i][j] = InputSingleNumber.inputNumber(input);
		

		System.out.println("Max value: " + max(list));
	}


	
		public static <E extends Comparable<E>> E max(E[][] list){
			E max=list[0][0];
			for (int i=0;i<list.length;i++)
				for (int j=0;j<list.length;j++){
					if(list[i][j].compareTo(max)>0)
						max=list[i][j];
				}
			return max;
		}

	

}
