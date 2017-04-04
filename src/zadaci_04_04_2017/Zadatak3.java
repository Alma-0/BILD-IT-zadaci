package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one string");
		String word = input.nextLine();
		System.out.println("Enter one letter");
		char letter = input.next().charAt(0);
		System.out.println(count(word, letter));
		input.close();

	}

	public static int count(String str, char a) {
		int length = str.length();
		if (length == 1 && str.charAt(length - 1) == a)
			return 1;
		else if (length == 1 && str.charAt(length - 1) != a)
			return 0;

		else {
			int count = 0;
			if (str.charAt(length - 1) == a)
				count++;
			str = str.substring(0, length - 1);
			return count + count(str, a);

		}

	}

}
