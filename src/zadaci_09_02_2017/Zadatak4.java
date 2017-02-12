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
		boolean process=true;
		int num=0;
		do{ try{ //ispis poruke
			System.out.println("Unesite broj redova matrice");
		num=input.nextInt();
		if(num>0)process=false;
		else System.out.println("Unesite broj veci od 0");}
		catch(Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process);
		
		//pozivanje metode
		printMatrix(num);
		//Zatvaranje Scanner-a
		input.close();

	}
}
