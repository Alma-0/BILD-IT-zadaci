package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite jedan string");
		String word = input.nextLine();
		char result=' ';
		for (int i = 0; i < word.length(); i++) {
			if (Character.isLetter(word.charAt(i))) {
				result = word.charAt(i);
				break;
			}
		}
		System.out.println("Duzina stringa je "+word.length());
		if (result==' ') System.out.println("Uneseni string "+word+" ne sadrzi slova");
		else System.out.println("Prvo slovo u stringu je "+result);
		input.close();

	}

}
