package bonusZadaci;


import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentTime=new Date();
		Scanner input=new Scanner(System.in);
	    int years=0;
		boolean process=true;
		//kontrolisanje unosa podataka
		do{ try{ System.out.println("Unesite broj godina za koliko zelite da se vratite u proslost(pozitivan broj i ne veci od 200 000 godina)");
		 years=input.nextInt();
		process=false;}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Wrong input");
			input.nextLine();}
		}while(process || years<=0 || years>200000);

		input.close();

		//jedna sekunda predstavlja jednu godinu, pomocu broja sekundi racunamo potrebno vrijeme
		int totalSeconds = years;
		int seconds = totalSeconds % 60;
		int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
		int totalHours = totalMinutes / 60;
		int hours = totalHours % 24;
        //ispis rezultata
		System.out.println("\n Putovanje ce trajati: "+hours+" sati, "+minutes+" minuta i "+seconds+" sekundi");

		//75 cm vracamo se jednu godinu unazad, proracun cm, m i km
		int cm = 75 * years;
		double m = cm / 100;
	    double km = cm / 100000;

		System.out.println("\nDa bi ste se vratili "+years+" godina u proslost potrebno je hodati "+km+"kilometara ili "
				+m+" metara ili "+cm+" centimetara");
						
		System.out.printf("\nTim koracima bi presli %6.3f  puta fudbalski stadion i %6.3f puta presli povrsimu Zemljine kugle",(m / 105),(km / 40075));

	}
}
