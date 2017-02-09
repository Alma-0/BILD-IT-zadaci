package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//varijable u koje pohranjujemo broj unesenih samoglasnika i suglasnika u stringu
				int numSa=0;
				int numSu=0;
				//novi Scanner
				Scanner input=new Scanner (System.in);
				//Unos stringa
				System.out.println("Unesite jednu recenicu");
				String r=input.nextLine();
				//sva slova unutar stringa pretvaramo u velika slova
				r=r.toUpperCase();
				//brojanje samoglasnika i suglasnika
				for (int i=0;i<r.length();i++){
					//radnja se izvrsava ukoliko je karakter slovo
					if (Character.isLetter(r.charAt(i))){
						if (r.charAt(i)=='A'||r.charAt(i)=='E'||r.charAt(i)=='I'||r.charAt(i)=='O'||r.charAt(i)=='U')
						numSa++;
					else numSu++;
				}
				}
				//Ispis rezultata
				System.out.println("Broj samoglasnika iznosi "+numSa+" ,a broj suglasnika iznosi "+numSu);
				//Zatvaranje Scanner-a
				input.close();


	}

}
