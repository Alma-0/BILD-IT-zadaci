package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deklarisanje varijable kojoj korisnik trenutno dodjeljuje vrijesnost
				int num;
				// deklarisanje varijable koja sluzi kao referentna vrijesnost
				int max=0;
				// novi Scanner
				Scanner input=new Scanner (System.in);
				//postavimo petlju na nacin da korisnin unosi brojeve-unos nule prekida niz
				do{System.out.println("Unesite jedan broj");
				   num=input.nextInt();
				   //varijabla num predstavlja trenutno unesenu vrijednost 
				   //ukoliko je varijabla num veca od trenutne maximalne vrijednosti, varijabli max se dodijeljue vrijednost num
				  if(num>max)max=num;}while(num!=0);
				//ispis rezultata
				System.out.println("Najveci broj u unesenom nizu je "+max);
				// zatvaranje Scanner-a
					input.close();

	}

}
