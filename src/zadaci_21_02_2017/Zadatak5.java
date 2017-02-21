package zadaci_21_02_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos gramaze i cijene proizvoda (unos cijelog ili decimalnog broja)
		System.out.println("Unesite tezinu prvog pakiranja (grama) i cijenu (KM), respektivno");
		double tezina1 = InputDoubleNumber.inputNumber(input, 0);
		double cijena1 = InputDoubleNumber.inputNumber(input, 0);

		System.out.println("Unesite tezinu prvog pakiranja (grama) i cijenu (KM), respektivno");
		double tezina2 = InputDoubleNumber.inputNumber(input, 0);
		double cijena2 = InputDoubleNumber.inputNumber(input, 0);
		// Racunanje kolicnika tezine i cijene proizvoda
		double product1 = tezina1 / cijena1;
		double product2 = tezina2 / cijena2;
		// Ispis rezultata
		if (product1 > product2)
			System.out.println("Isplativije je kupiti proizvod broj 1");
		else if (product2 > product1)
			System.out.println("Isplativije je kupiti proizvod broj 2");
		else
			System.out.println("Proizvodi imaju istu cijenu");

	}

}
