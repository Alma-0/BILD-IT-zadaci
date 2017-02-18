package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean process = true;
		int numWeek = 0;
		int numFut = 0;
		Scanner input = new Scanner(System.in);
		do {
			try {// Unos podataka
				System.out.println("Unesi broj za danasnji dan (0-Pon, 1-Uto, 2-Sri, 3-Cet, 4-Pet, 5-Sub, 6-Ned)");
				numWeek = input.nextInt();
				System.out.println("Unesi broj dana nakon danasnjeg dana");
				numFut = input.nextInt();
				process = false;
				// Provjera ispravnosti unesenih vrijednosti
				if (numWeek < 0 || numWeek > 6 ||numFut<0) {
					System.out.println("Broj za danasnji dan mora biti u intervalu [0,6], broj nakon treba biti veci od nule");
					process = true;
				}
			} catch (Exception e) {
				// ispis u slucaju exception-a
				System.out.println("Pogresan unos");
				input.nextLine();
			}
		} while (process);
		// Niz sa imenima dana u sedmici
		String[] week = { "Ponedjeljak", "Utorak", "Srijeda", "Cetvrtak", "Petak", "Subota", "Nedjelja" };
		// ispis rezultata
		System.out.println("Danas je " + week[numWeek] + " a dan u buducnosti je " + week[(numWeek + numFut) % 7]);
		input.close();

	}

}
