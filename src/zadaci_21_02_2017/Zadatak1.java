package zadaci_21_02_2017;

import userInput.InputDoubleNumber;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos iznosa racuna
		System.out.println("Unesite iznos racuna");
		// Unos cijelog ili decimalnog broja veceg od nule
		double bill = InputDoubleNumber.inputNumber(input, 0);
		System.out.println("Unesite procenat racuna, koji zelite dati kao napojnicu");
		// Unos vrijednosti napojnice u procentima(cijeli ili decimalni broj)
		double tip = InputDoubleNumber.inputNumber(input);
		if (tip < 5 || tip > 15)
			System.out.println("Preporuka za napojnicu: 5-15 % od iznosa racuna");
		double totalTip = (tip / 100) * bill;
		System.out.println(
				"Napojnica iznosi " + totalTip + ", ukupan iznos koji trebate platiti je " + (bill + totalTip));

	}

}
