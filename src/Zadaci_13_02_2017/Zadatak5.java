package Zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	//nova metoda
	public static int countLetters(String s){
		//brojac slova u unesenom stringu
		int count=0;
		//provjera koliko ima slova u stringu s
		for (int i=0;i<s.length();i++)
			if(Character.isLetter(s.charAt(i)))count++;
		//vraca rezultat
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//ispis poruke
		System.out.println("Unesite jedan string");
		//unos stringa
		String rijec=input.nextLine();
		//poziv metode, ispis rezultata
		System.out.println("Broj slova u unesenom stringu je "+countLetters(rijec));
	}
}
