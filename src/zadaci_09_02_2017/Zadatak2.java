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
		//ispis poruke, unos 
		System.out.println("Unesite broj pitanja");
		int num=input.nextInt();
		//ispis poruke- rezultata
		System.out.println("Broj tacnih odgovora iznosi "+Questions(num));
		//Zatvaranje Scanner-a
		input.close();
	}

}
