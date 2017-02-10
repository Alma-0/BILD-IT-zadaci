package zadaci_09_02_2017;
import java.util.Scanner;
public class Zadatak5 {
	//Nova metoda
	public static int coins(int num){
		//Pocetva vrijednost brojaca strane pisma (pismo-0, glava-1)
		int pismo=0;
		//Ponavljanje bacanja num puta
		for (int i=1;i<=num;i++){
			//varijabli a dodijeljuje se trenutna random vrijednost
			int a=(int)(Math.random()*2);
			//ukoliko je random vrijednost nula-pismo povecava se vrijednost pohranjena u brojacu (preostala bacanja ce biti jedan -glava)
			if (a==0)
				pismo++;	
		} 
		//Vraca vrijednost pismo-brojac
		return pismo;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Novi Scanner
		Scanner input=new Scanner (System.in);
		//Ispis poruke
		System.out.println("Unesite broj bacanja novcica");
		//Unos broja bacanja
		int num=input.nextInt();
		//metodu pozivamo samo jednom, tu vrijednost dodjeljujemo varijabli pismo, broj bacenih nula
		int pismo=coins(num);
		//varijabli glava dodijeljujemo broj bacenih jedinica(glava), tj. od ukupnog broja bacanja oduzmemo broj onih koji prestavljaju pismo
		int glava=num-pismo;
		//ispis poruke-rezultata
		System.out.println("Novcic je pao "+glava+" na stranu pismo a "+pismo+" na stranu glava");
		//Zatvaranje Scanner-a
		input.close();

	}

}
