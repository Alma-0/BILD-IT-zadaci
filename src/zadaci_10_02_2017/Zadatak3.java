package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	//nova metoda
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		//provjera da li su clanovi dva niza, koji se nalaze na istim pozicijama, jednaki
		for (int i=0;i<niz1.length;i++){
			if (niz1[i]!=niz2[i]){
				//u slucaju da neki od clanova nisu jednaki vraca se false vrijednost
				return false;
				}
		}return true;
	}


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//referentne vrijednosti za izvrsavanje do while bloka
		boolean process=true;
		boolean process1=true;
		boolean process2=true;
		int num=0;
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ System.out.println("Unesite broj clanova niza");
		num=input.nextInt();
		if(num>0)process=false;}
		catch(Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process);
		//novi nizovi, num dimenzija
		int[] array1=new int[num];
		int[] array2=new int[num];
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ System.out.println("Unesite clanove prvog niza");
		for (int i=0;i<num;i++)
			array1[i]=input.nextInt();
		process1=false;}
		catch (Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process1);
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{ try{ System.out.println("Unesite clanove drugog niza");
		for (int i=0;i<num;i++)
			array2[i]=input.nextInt();
		process2=false;}
		catch (Exception e){
			//ispis poruke u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process2);
		
		
		input.close();
		//ispis rezultata
		System.out.println("Uneseni nizovi su identicni: "+equals(array1, array2));

	}

}
