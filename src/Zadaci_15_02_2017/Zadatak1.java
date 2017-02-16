package Zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0;
		//novi niz, za pohranu unsenih brojeva
		int [] array=new int [3];
		for (int i=0;i<3;i++){
			array[i]=(int)(Math.random()*10);
			sum+=array[i];}
		boolean process=true;
		do { try{ System.out.println("Koliko iznosi "+array[0]+"+"+array[1]+"+"+ array[2]);
		int result=input.nextInt();
		process=false;
		//Ukoliko je suma clanova niza jednaka unosu odgovor je tacan, ispis poruke
		if(result==sum)System.out.println("Cestitamo, tacan odgovor");
		if(result!=sum){
			//ukoliko suma clanova niza nije jednaka unosu, ponavljanje radnje
			System.out.println("Pogresan odgovor, pokusajte ponovo");
			process=true;
		}
		}
		catch(Exception e){
			//ispis poruke u slucaju exceptiona
			System.out.println("Pogresan unos, pokusaj ponovo");
			input.nextLine();
		}}while(process);
		input.close();
			

	}

}
