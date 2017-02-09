package zadaci_08_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kreiran novi niz cija je duzina 100
		int[] array = new int[100];
		// niz koji ce nam sluziti za brojanje koliko je puta neki broj unesen
		//sadrzi 10 clanova obzirom da su brojevi od 0 do 9
		int[] count = new int[10];
			// dodavanje elemenata u niz
			for (int i = 0; i < array.length; i++) {
				// dodavanje nasumicnih cjelih brojeva nizu, u intervalu od 0 do 9
					int num = (int)(Math.random()*10);
					array[i] = num;
					//brojanje koliko je puta predhodni broj unesen
					count[num]++;
						}
						
					
				// ispis rezultata pomocu petlje
				for (int i = 0; i < count.length; i++) {
				   // ispis brojeva koji su se pojavili
					if (count[i] != 0) {
						// u slucaju da se pojavio jednom ispise se rijec put, u ostalim slucajevima puta
						System.out.println("Broj " + i + " se pojavljuje " + count[i]
							+ (count[i] == 1 ? " put." : " puta."));


			}}}

	}


