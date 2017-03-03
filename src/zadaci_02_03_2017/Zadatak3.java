package zadaci_02_03_2017;

import userInput.InputDoubleNumber;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Unesite vrijednosti koeficijenata kvadratne jednacine a,b,c, respektivno ");
		double a = InputDoubleNumber.inputNumber(input);
		double b = InputDoubleNumber.inputNumber(input);
		double c = InputDoubleNumber.inputNumber(input);
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		if (equation.getDiscriminant() > 0)
			System.out.printf("\nJednacina ima dva rjesenja: r1=%.2f, r2=%.2f", equation.getRoot1(),equation.getRoot2());
		else if (equation.getDiscriminant() == 0)
			System.out.printf("\nJednacina ima jedno rjesenja: r=%.2f",equation.getRoot1());
		else
			System.out.println(
					"\nDiskriminantnta jednacine je negativan broj, jednacina nema rjesenje iz skupa realnih brojeva");

	}

}
