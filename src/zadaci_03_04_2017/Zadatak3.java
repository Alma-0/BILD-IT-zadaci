package zadaci_03_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Unesi broj clanova harmonijskog niza u intervalu [1,10] ");
		int index=InputSingleNumber.inputNumber(input,0,10);
		System.out.printf("Suma niza iznosi: %4.2f ",m(index));

	}

	public static double m(double i) {
		if (i == 1)
			return 1;
		else
			return m(i - 1) + 1 / i;
	}

}
