package Zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	public static int month(String month, int year){
		//U slucaju da je godina prestupna, uneseni mjesec Feb vraca 29
		if (month.equals("Feb")) {if ((year%4==0 && year%100!=0)|| (year%400==0)){
			return 29;}
		//u slucaju da nije prestupna a mjesec Feb vraca 28
		else return 28;}
		
		if(month.equals("Jan")||month.equals("Mar")||month.equals("Maj")||month.equals("Jul")||month.equals("Aug")||
				month.equals("Okt")||month.equals("Dec"))
			return 31;
		
		if(month.equals("Apr")||month.equals("Jun")||month.equals("Sep")||month.equals("Nov"))
			return 30;
	
	     return 1 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		String month="";
		int year=0;
		boolean process=true;
		do { try{ 
			System.out.println("Unesite godinu(broj veci od nule)");
			year =input.nextInt();
			System.out.println("Unesite pocetna tri slova mjeseca (Prvo slovo veliko)");
		    month=input.next();
		process=false;
		if(month(month, year)==1){
				System.out.println("Pogresan unos, pokusajte ponovo");
				process=true; }
		}
		catch(Exception e){
			//ispis poruke u slucaju exceptiona
			System.out.println("Pogresan unos, pokusaj ponovo");
			input.nextLine();
		}}while(process || year<=0);
		
		//Poziv metode, ispis rezultata
		if (month(month, year)==29){
		System.out.println(month + " "+year+ ". ima 29 dana"); 
				}
		else if(month(month, year)==28) System.out.println(month+" " + year+ ". ima 28 dana.");
		else if(month(month, year)==31){
		System.out.println(month+" "+year+". ima 31 dana ");
				}
		else if(month(month, year)==30)
				System.out.println(month+" "+year+". ima 30 dana ");
		input.close();
	}

}
