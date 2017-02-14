package Zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double V=0;
		double a=0;
		//referentna varijabla
		boolean process=true;
		//do while petlja i try catch za kontrolu unosa podataka
		do{ try{ System.out.println("Unesite brzinu u m/s i ubrzanje u m/(s*s), respektivno (vrijednost mora biti veca od nule)");
		 V=input.nextDouble();
		 a=input.nextDouble();
		process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Wrong input");
			input.nextLine();}
		}while(process || V<=0 || a<=0);
		//proracun duzine pomocu unesene brzine i ubrzanja
		double s=(V*V)/(2*a);
		//ispis rezultata
		System.out.printf("Duzina piste je %6.3f m",s);


	}

}
