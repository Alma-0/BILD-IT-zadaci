package Zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//ispis poruke
		System.out.println("Unesite jedan string");
		String rijec=input.nextLine();
		//pomocu petlje ispisuje brojeve na neparnim pozicijama
		System.out.println("Ispis neparnih pozicija");
		for (int i=0;i<rijec.length();i+=2){
			System.out.print(rijec.charAt(i));
		}

	}

}
