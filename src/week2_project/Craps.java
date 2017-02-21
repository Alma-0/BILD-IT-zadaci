package week2_project;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Craps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 1;
		int sum = 0;
		do {
			//Ispis poruke, za pocetak igre treba unijeti 1
			System.out.println("Do you want to play 1-Yes, 0-No");
			choice = InputSingleNumber.inputNumber(input, 0, 1);
			if (choice == 0)
				break;
			sum = roll();
			//Ukoliko je suma 2,3 ili 12, ispis poruke, igra zavrsava
			if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You lose");
			} else if (sum == 7 || sum == 11)
				//Ukoliko je suma 7,11, ispis poruke, igra zavrsava
				System.out.println("You win");
			else {
				//Ukoliko je rezultat neki drugi broj, igra se nastavlja
				System.out.println("Point is " + sum);
				rollAgain(sum);

			}

		} while (choice == 1);
	}

	public static void rollAgain(int newSum) {
		int sum = 0;
		do {
			sum = roll();
			if (sum == 7)
				//Ukoliko je rezultat 7, ispis poruke, igra zavrsava
				System.out.println("You lose");
			if (sum == newSum)
				//Ukoliko je rezultat uneseni broj pri pozivu metode, ispis poruke, igra zavrsava
				System.out.println("You won");
			//Ukoliko je rezultat nije 7 i newSum radnja se ponavlja
		} while (sum != 7 && sum != newSum);

	}

	public static int roll() {
		//Bacanje kockica, kockica moze imati vrijednosti [1,6]
		int num1 = (int) (Math.random() * 6 + 1);
		int num2 = (int) (Math.random() * 6 + 1);
//rezultat se dodijeljuje varijabli sum
		int sum = num1 + num2;

		// pauziramo program pola sekunde i simuliramo bacanje dvije kockice
		try {
			Thread.sleep(500);
			System.out.print("|" + num1 + "|");
			Thread.sleep(500);
			System.out.print("|" + num2 + "|");
			Thread.sleep(500);
		} catch (Exception ex) {

		}

		// ispis brojeva koje je korisnik dobio
		System.out.print(" You rolled " + num1 + " + " + num2 + " = " + sum + "\n");

		return sum;
	}

}
