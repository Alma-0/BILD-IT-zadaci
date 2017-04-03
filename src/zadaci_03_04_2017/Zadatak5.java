package zadaci_03_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Unesi broj clanova niza u intervalu [1,10] ");
		int index=InputSingleNumber.inputNumber(input,0,10);
		System.out.printf("Suma niza iznosi: %4.2f ",m(index));

	}

	public static double m(double i) {
		if (i == 1)
			return 1/2.0;
		else
			return m(i - 1)+i/(i+1); 
	}

	

}
