package zadaci_09_02_2017;
import java.util.Scanner;

public class Zadatak2 {
	//nova metoda
	public static int Questions(int num){
		//novi Scanner
		Scanner input=new Scanner (System.in);
		//brojac tacnih odgovora
		int count=0;
		//ponavljanje num puta
		for (int i=1;i<=num;i++){
			//dodjeljivanje random vrijednosti varijablama
			int num1=(int)(Math.random()*10);
			int num2=(int)(Math.random()*10);
			//ispis poruke
			System.out.println("Koliko iznosi " + num1+ "+" + num2);
			//ukoliko je odgovor tacan vrijednost brojaca se povecava
			if(input.nextInt()==(num1+num2))count++;
			
	    }
		//zatvaranje Scanner-a
		input.close();
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Novi Scanner
		Scanner input=new Scanner (System.in);
		boolean process=true;
		int num=0;
		//ispis poruke, unos 
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
				do{ try{ System.out.println("Unesite broj pitanja");
				num=input.nextInt();
				if(num>0)process=false;
				else System.out.println("Unesite broj veci od 0");}
				catch(Exception e){
					System.out.println("Pogresan unos");
					input.nextLine();}
				}while(process);
		
		
		
		
		
		
		//ispis poruke- rezultata
		System.out.println("Broj tacnih odgovora iznosi "+Questions(num));
		//Zatvaranje Scanner-a
		input.close();
	}

}
