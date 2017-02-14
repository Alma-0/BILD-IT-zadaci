package bonusZadaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//referentna varijabla
		boolean process=true;
		int sGodina=0;
		Scanner input=new Scanner (System.in);
		//unos podatka
		do{ try{ System.out.println("Unesite broj svjetlosnih godina (pozitivan broj)");
		 sGodina=input.nextInt();
		 process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process || sGodina<=0);
		//proracun ukupne kilometraze svjetlosnih godina
		double result=9.461 * Math.pow(10,12)*sGodina;
		//broj AU jedinica svjetlosnih godina
		double AU=(63239.7*sGodina);
		//broj Parseca
		double pc=(0.3067*sGodina);
		//ispis rezultata
		System.out.println("Broj kilometara koju svjetlost predje u datom vremenu je "+ result+" kilometara");
        System.out.printf("Za uneseno vrijeme predje %f AU i %f pc", AU,pc);
        System.out.println("");
	}

}
