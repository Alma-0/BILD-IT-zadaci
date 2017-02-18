package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = input.nextLine();
		System.out.println("Enter second string");
		String second = input.nextLine();
		System.out.println("\"" + second + "\" is substring of \"" + first + "\":" + first.contains(second));
		input.close();

	}

}
