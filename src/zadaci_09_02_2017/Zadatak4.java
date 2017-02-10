package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	//Nova metoda
	 public static void printMatrix(int n){
		 //petlja koja broji redove
	    	for (int i=0;i<n;i++){
	    		//petlja koja broji kolone
	    		for (int j=0;j<n;j++)
	    			//svakom clanu (j) kolone i (i) reda se dodjeljuje random broj
	    			System.out.print((int)(Math.random()*2)+" ");
	    		//novi red
	    		System.out.println();
	    	}	
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Novi Scanner
		Scanner input=new Scanner (System.in);
		//ispis poruke
		System.out.println("Unesite broj redova matrice");
		//unos rezultata
		int num=input.nextInt();
		//pozivanje metode
		printMatrix(num);
		//Zatvaranje Scanner-a
		input.close();

	}
}
