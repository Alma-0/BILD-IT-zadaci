package zadaci_28_02_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;
import userInput.InputSingleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj redova u nizu, interval[1,1000]");
		int row = InputSingleNumber.inputNumber(input, 1, 1000);

		System.out.println("Unesite broj kolona u nizu, interval[1,1000]");
		int column = InputSingleNumber.inputNumber(input, 1, 1000);

		double[][] array = new double[row][column];
		System.out.println("Unesite clanove niza, decimalni broj - interval[-1000,1000]");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = InputDoubleNumber.inputNumber(input, -1000, 1000);
			}
		}
		Location object = new Location(array);

		System.out.println("Lokacija najveceg elementa je " + object.max + " u " + (object.row+1) + ". redu i "
				+ (object.column+1) + ". koloni.");

		input.close();

	}

}
