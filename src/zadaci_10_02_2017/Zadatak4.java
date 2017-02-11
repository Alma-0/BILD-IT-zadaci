package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	public static int[ ] locateLargest(double[ ][ ] a){
		double max=a[0][0];
		//pocetne vrijednosti za poziciju najvece vrijednosti
		int maxR=1;
		int maxC=1;
		for (int i=0;i<a.length;i++)
			for (int j=0;j<a[0].length;j++)
				//poredjenje vrijednosti
				if(a[i][j]>max) {
					max=a[i][j];
					//povecavamo vrijednost za 1 kako bi ispisani rezultat bio razumljjiv korisniku
					maxR=i+1;
					maxC=j+1;
				}
		//dodjeljivanje vrijednosti nizu
		int [] result={maxR,maxC};
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		//referentne vrijednosti za do while blok
		boolean process=true;
		boolean process2=true;
		//varijable koje ce sluziti za pohranu rezultata unesenih od strane korisnika
		int rowsN=0;
		int columnsN=0;
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ System.out.println("Unesite broj redova i kolona, respektivno (pozitivan broj)");
		   rowsN=input.nextInt();
		   columnsN=input.nextInt();
		if(rowsN>0 && columnsN>0)process=false;}
		catch(Exception e){
			//ispis poruke u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		//u slucaju da je process=true blok radnji se ponavlja
		}while(process);
		//novi niz
		double[][] array=new double[rowsN][columnsN];	
		do{ try{ System.out.println("Unesite clanove niza ");
          for (int i=0;i<rowsN;i++)
			for (int j=0;j<columnsN;j++)
				array[i][j]=input.nextDouble();
		process2=false;}
		catch (Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process2);
		//pozivanje metode, dodjeljivanje rezultata nizu
		int [] result=locateLargest(array);
		//ispis rezultata
		System.out.println("Najveci element niza se nalazi u "+result[0]+". redu i "+result[1]+". koloni");
		input.close();
			

	}

}
