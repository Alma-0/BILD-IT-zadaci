package zadaci_22_02_2017;

import java.util.Scanner;
import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Racunar generise random brojeve u intervalu [1,2]
		int x = (int) (Math.random() * 3);
		// Ispis poruke. Unos podataka
		System.out.print("Unesite 0 (makaze), 1(papir), 2(bunar)");
		int broj = InputSingleNumber.inputNumber(input, 0, 2);
		// Ispis rezultata ukoliko ste unijeli nulu (ispis ovisan o generisanom
		// random broju)
		if (broj == 0) {
			System.out.println("Izabrali ste makaze");
			if (x == 0) {
				System.out.println("Racunar je izabrao isto makaze, nerijeseno je");
			} else if (x == 1) {
				System.out.println("Racunar je izabrao papir,vi ste pobijedili");
			} else
				System.out.println("Racunar je izabrao bunar, racunar je pobijedio");
		}

		// Ispis rezultata ukoliko ste unijeli jedan (ispis ovisan o generisanom
		// random broju)
		if (broj == 1) {
			System.out.println("Izabrali ste papir");
			if (x == 0) {
				System.out.println("Racunar je izabrao makaze, racunar je pobijedio");
			} else if (x == 1) {
				System.out.println("Racunar je izabrao papir,nerijeseno je");
			} else
				System.out.println("Racunar je izabrao bunar, vi ste pobijedili");
		}

		// Ispis rezultata ukoliko ste unijeli dva (ispis ovisan o generisanom
		// random broju)
		if (broj == 2) {
			System.out.println("Izabrali ste bunar");
			if (x == 0) {
				System.out.println("Racunar je izabrao makaze, vi ste pobijedili");
			} else if (x == 1) {
				System.out.println("Racunar je izabrao papir,racunar je pobijedio");
			} else
				System.out.println("Racunar je izabrao bunar, nerijeseno je");
		}

		input.close(); 

	}

}
