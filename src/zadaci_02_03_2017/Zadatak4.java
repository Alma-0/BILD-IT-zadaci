package zadaci_02_03_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koeficijente:a,b,c,d,e,f kvadratnih jednacina {ax+by=e,cx+dy=f}");
		double a = InputDoubleNumber.inputNumber(input);
		double b = InputDoubleNumber.inputNumber(input);
		double c = InputDoubleNumber.inputNumber(input);
		double d = InputDoubleNumber.inputNumber(input);
		double e = InputDoubleNumber.inputNumber(input);
		double f = InputDoubleNumber.inputNumber(input);
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		if (linear.isSovable())
			System.out.printf("Rjesenja jednacine su: x=%.4f, y=%.4f", linear.getX(), linear.getY());

		else
			System.out.println("Jednacina nema rjesenja");

	}

}
