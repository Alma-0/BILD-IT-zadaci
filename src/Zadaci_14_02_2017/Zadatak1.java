package Zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		double investment=0;
		double interestRate=0;
		int numYears=0;
		//referentna varijabla
		boolean process=true;
		//do while petlja i try catch za kontrolu unosa podataka
		do{ try{ System.out.println("Unesite iznos investicije, godišnju iteresnu stopu i broj godina vracanja, respektivno (vrijednost veca od nule)");
		investment=input.nextDouble();
		interestRate=input.nextDouble();
		numYears=input.nextInt();
		process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		//uslov ponavljanja
		}while(process || investment<=0 || interestRate<=0 || numYears<=0);
		double futValue =investment * (Math.pow((1 + interestRate/1200),numYears*12));
		//ispis rezultata
		System.out.printf("Buduca vrijednost investicije je %6.2f",futValue);
		input.close();

	}

}
