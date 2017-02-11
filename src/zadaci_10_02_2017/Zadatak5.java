package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {
	//nova metoda
	public static double[ ][ ] sortRows(double[ ][ ] array){
		for (int i=0;i<array.length;i++)
			//sortiranje clanova "i" reda, od najmanjeg do najveceg
			Arrays.sort(array[i]);
		return array;
			}

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		//referentne vrijednosti za izvrsavanje do while bloka
		boolean process1=true;
		boolean process2=true;
		int size1=0;
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ //unos dimenzija kvadratne matrice
			System.out.println("Unesite dimenzije kvadratne matrice");
		    size1=input.nextInt();
		if (size1>0) process1=false;}
		catch(Exception e){
			//izvrsava se u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		} while(process1);
		
		// novi 2D niz, dimenzija koje je korisnik unio
		double [][] array=new double[size1][size1];
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ System.out.println("Unesite elemente matrice");
		for (int i=0;i<size1;i++)
			for (int j=0;j<size1;j++)
				array[i][j]=input.nextDouble();
		        process2=false;}
		catch(Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();}
		} while(process2);
		//poziv metode, dodjeljivanje rezultata novom kreiranom nizu
		double [][] arrayResult=sortRows(array);
		//ispis rezultata
		System.out.println("Novi niz je: ");
		for (int i=0;i<size1;i++){
			for (int j=0;j<size1;j++)
			    System.out.print(arrayResult[i][j]+" ");
		System.out.println();
		input.close();
		}
	}
}
