package Zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num1=1;
		int num2=1;
		//referentna varijabla
		boolean process=true;
	    System.out.println("Ispis prestupnih godina u zeljenom intervalu");
		//do while petlja i try catch za kontrolu unosa podataka
		do { try{ System.out.println("Unesite pocetnu i krajnju godinu ");
		num1=input.nextInt();
		num2=input.nextInt();
		//manji broj num1, veci broj num2
		if(num1>num2) {int temp=num2; num2=num1; num1=temp;}
		process=false;
		if( (num1<=0 || num2<=0)) System.out.println("Broj mora biti pozitivan, racunaju se samo godine poslije nove ere");}
		catch(Exception e){
			//ispis poruke u slucaju exceptiona
			System.out.println("Pogresan unos, pokusaj ponovo");
			input.nextLine();
		}}while(process ||num1<=0 || num2<=0);
		//brojac
		int count=0;
		for (int i=num1;i<=num2;i++){
			//uslov da bi godina bila prestupna
			if (((i%4==0)&&(i%100!=0))||(i%400==0)){
				////ukoliko je uslov zadovoljen povecavamo brojac
				count++;
				//ispis
				System.out.print(i+" ");
				//ukoliko je ispisano 10 godina u jednom redu prelazi u novi red
				if (count%10==0)System.out.println();	
			}
		}

	}

}
