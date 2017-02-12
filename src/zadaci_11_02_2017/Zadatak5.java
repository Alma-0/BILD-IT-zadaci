package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		//novi niz, 100 clanova
		int[] array=new int[100];
		//varijabla koja sprema sumu unesenih brojeva
		double sum=0;
		//varijabla za kontrolisanje petlje
		boolean process=true;
		int count=0;
		//brojac brojeva ispod prosjeka
		int countLow=0;
		//brojac brojeva jednakih ili vecih od prosjeka
		int countHigh=0;
		//petlja i try catch blok za kontrolisanje unosa
		
				//korisnik moze unijeti maximalno 100 brojeva
			for (int i=0;i<array.length;i++){
				process=true;
			do{ 
			try{System.out.println("Unesite jedan broj");
			//nula prekida niz i ne broji se kao clan niza, program radi i sa negativnim brojevima
	        if((array[i]=input.nextInt())==0)break;
	        //povecanje sume za uneseni broj
	        sum+=array[i];
	        //povecanje brojaca za broj unesenih clanova niza
	        count++; 
	        process=false;}   
		
			catch(Exception e){
				//ispis poruke u slucaju pogreske, nastavlja sa unosom
				System.out.println("Pogresan unos");
				input.nextLine();
			}}while(process);
			//ukoliko je unesena nula izlazi iz for petlje
			if (array[i]==0) break;}
		//proracun prosjeka
		double average=sum/count;
		//izracunavanje koliko je brojeva manje ili jednako i vece od prosjeka
		for (int i=0;i<count;i++){
			if (array[i]<average)countLow++;
			else countHigh++;
		}
		//ispis rezultata
		System.out.println(countLow + " brojeva je ispod prosjeka");
		System.out.println(countHigh+ " brojeva je iznad ili jednako prosjeku");
		input.close();
		
	}
		
	}


