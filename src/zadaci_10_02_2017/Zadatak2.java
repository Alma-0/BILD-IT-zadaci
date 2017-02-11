package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
	//nova metoda
	public static double min(double[ ] array){
		//sortiranje double vrijednosti niza, od najmanjeg ka najvecem
		Arrays.sort(array);
		//vracanje rezultata
		return array[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		//referentna varaijabla za do while blok
		boolean process=true;
		//novi niz, 10 clanova
		double [] array=new double[10];
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ System.out.println("Enter 10 numbers");
		for (int i=0;i<10;i++)
			array[i]=input.nextDouble();
		process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process);
		
		//ispis rezultata
		System.out.println("Smallest value in array is "+min(array));
		input.close();
			
		

	}

}
