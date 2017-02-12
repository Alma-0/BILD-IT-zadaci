package zadaci_11_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {
	 public static void displaySortedNumbers(double num1, double num2, double num3){
		 //dodavanje brojeva u niz
		 double [] array={num1, num2, num3};
		 //sortiranje niza
		 Arrays.sort(array);
		 //ispis rezultata
		 System.out.println("Clanovi niza u rastucem redoslijedu su: "+array[0]+" "+array[1]+" "+array[2]);
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//referentna vrijednost za kontrolisanje petlje
		boolean process=true;
		//deklarisanje varijabli
		double num1=0, num2=0, num3=0;
		//petlja i try catch kako bi regulisali unos podataka, program radi ispravno sa negativnim vrijednostima
		do{try{System.out.println("Unesite tri broja");
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		process=false;}
		catch(Exception e){System.out.println("Pogresan unos");
		input.nextLine();}
		}while(process);
		input.close();
		//pozivanje metode
		displaySortedNumbers(num1, num2, num3);

	}

}
