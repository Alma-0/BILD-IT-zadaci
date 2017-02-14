package Zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//referentna varijabla za kontrolisanje toka petlje
		boolean process=true;
		//novi niz od 10 clanova
		int[] array=new int[10];
		//unos podataka
		do{ try{ System.out.println("Enter 10 numbers");
		//unos brojeva u niz
		for (int i=0;i<10;i++)
			array[i]=input.nextInt();
		process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process);
		//ispis reverzije unesenog niza
		for (int i=(array.length-1);i>=0;i--){
			System.out.print(array[i]+" ");
		}

	}

}
