package zadaci_24_02_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("Unesite cijeli broj, interval [%d,%d]",Integer.MIN_VALUE,Integer.MAX_VALUE);
		int number=InputSingleNumber.inputNumber(input);
		System.out.printf("Unesite cijeli broj za sirinu, interval [%d,%d]",1,20);
		int width=InputSingleNumber.inputNumber(input,0,20);
		System.out.println(format(number,width));
	}
	
		public static String format(int number, int width) {
			return String.format("%0" + width + "d", number);
	}
	
	

}
