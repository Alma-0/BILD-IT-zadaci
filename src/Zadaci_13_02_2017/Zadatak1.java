package Zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		//referentna varijabla
		boolean process=true;
		//
		int mjeseci=0;
		double stednja=0;
		//do while blok za kontrolu unosenja vrijednosti
		do{ try{ System.out.println("Molim unesite mjesecni iznos stednje i broj mjeseci nakon kojeg bi zeljeli znati stanje racuna, respektivno(broj veci od 0)");
		 stednja = input.nextDouble();
		 mjeseci = input.nextInt();
		process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process || stednja<=0 || mjeseci<=0);
		
		double suma=0;
		double result=0;
		for (int i=0;i<mjeseci;i++){
			//izracun sume pomocu vec definisane formule
			suma = (stednja+suma )*(1+0.00417);
			}
		//ispis rezultata
		System.out.printf("vrijednost vase stednje nakon %d mjeseci iznosi %6.3f ", mjeseci, suma );

	}

}
