package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Unos stringa
		System.out.println("Enter one string");
		String word = input.next();
		// unos karaktera (bilo koji znak)
		System.out.println("Enter one character");
		char chars = input.next().charAt(0);
		// Ispis koliko karakter sadzi unesenih znakova
		System.out.println("String " + word + " contains " + chars + " " + count(word, chars) + " times");
		input.close();

	}

	// metoda za brojanje karaktera unutar unesenog stringa
	public static int count(String str, char a) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == a) {
				count++;
			}
		}
		return count;
	}

}
