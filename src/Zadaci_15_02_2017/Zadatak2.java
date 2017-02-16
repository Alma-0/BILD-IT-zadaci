package Zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	public static int month(int month, int year){
		//Ukoliko je godina prijestupna vraca 29
		if (month==2) {if ((year%4==0 && year%100!=0)|| (year%400==0)){
			return 29;}
		//Ukoliko nije prijestupna za februar vraca 28
		else return 28;}
		//Ukoliko je unos mjesec koji ima 30 dana, vraca 30
		else if(month==4||month==6||month==9||month==11)
			return 30;
		//za sve ostale slucajeve vraca 31
		else return 31 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		boolean process=true;
		int month=0;
		int year=0;
		//Niz sa imenima mjeseci
		String[] monthName={"Januar","Februar","Mart","April","Maj","Juni","Juli","August","Septembar","Oktobar","Novembar","Decembar"};
		do { try{ 
			System.out.println("Molim unesite mjesec i godinu, respektivno (Godina-pozitivan broj, mjesec u intervalu [1,12])");
			month = input.nextInt();
			year = input.nextInt();
		    process=false;
		}
		catch(Exception e){
			//ispis poruke u slucaju exceptiona
			System.out.println("Pogresan unos, pokusaj ponovo");
			input.nextLine();
			//u slucaju da dodje do nezeljenog unosa radnja se ponavlja
		}}while(process || year<=0 ||month<=0||month>12);
		input.close();
		//ispis rezultata
		System.out.println(monthName[month-1]+" "+year+". ima "+month(month,year)+" dana");
		
        
	}

}
