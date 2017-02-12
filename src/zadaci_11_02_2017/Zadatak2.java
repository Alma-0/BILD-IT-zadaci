package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//referentna vrijednost za kontrolisanje petlje
		boolean process=true;
		int sum=0;
		String number;
		//kreiranje novog niza cijelih brojeva
		int [] array=new int[9];
		//petljom ogranicavamo korisnika da uneseni brojevi trebaju biti cijeli, da ih ima 9
		do{process=true;
			System.out.println( "Unesite prvih 9 brojeva Vaseg ISBN broja (napomena: bez razmaka)");
		number=input.nextLine();
		//provjera duzine stringa
		if(number.length()!=9) process=false;
		else{
			for (int i=0;i<9;i++){
				//provjera da li su svi clanovi stringa brojevi
				if(!Character.isDigit(number.charAt(i))) process=false;
				else
				  array[i]=Integer.valueOf(String.valueOf(number.charAt(i)));
			}}
				
		}while(!process);
		//izracun sume po postavljenoj formuli
		for (int i=0;i<9;i++){
			sum+=Integer.valueOf(array[i])*(i+1);
		}
		//racunanje desete cifre
		String result=sum%11+"";
		//ukoliko je deseta cifra broj 10 potrebno je da program ispisuje x
		if(result.equals("10"))result="X";
		//ispis rezultata
		System.out.println("ISBN broj je "+(number+result));
		input.close();

	}

}
