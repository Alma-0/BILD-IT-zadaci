package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	
	//nova metoda
		public static int maxCon(int num1, int num2){
			//kreirana varijabla pomocu koje vrsimo zamjenu vrijednosti varijabli
			int s;
			//pocetni rezultat
			int result=1;
			//poredimo varijable, manja vrijednost se pohranjuje u num1, veca u num2
			if (num1>num2){s=num1;num1=num2;num2=s;}
			//u tijelu petlje postavlja se uslov za najveci zajednicki sadrzilac
			for(int i=1;i<=num1;i++){
				//da bi broj bio sadrzilac nekog drugog broja potrebno je da njihov kolicnik bude cijeli broj
				if(((num1%i)==0) && ((num2%i)==0))result=i;
			}
			//vracanje resultata
			return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Novi Scanner
				Scanner input=new Scanner (System.in);
				//varijable kojima korisnik dodijeljuje vrijednost
				int num1;
				int num2;
				//ogranicavanje rada programa na pozitivne brojeve, unos brojeva
				do{System.out.println("Molim unesite dva broja");
				num1=input.nextInt();
				num2=input.nextInt();}while (num1<0 || num2<0);
				//Pozivanje metode, ispis rezultata
				System.out.println("Najveci zajednicki sadrzilac je "+maxCon(num1, num2));
				//Zatvaranje Scanner-a
				input.close();


	}

}
