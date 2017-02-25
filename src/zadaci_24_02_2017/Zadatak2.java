package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite jedan karakter");
		char letter = input.next().charAt(0);
		int number = (int) letter;
		System.out.println("Unicode karaktera " + letter + " je " + number);
		input.close();

	}

}
