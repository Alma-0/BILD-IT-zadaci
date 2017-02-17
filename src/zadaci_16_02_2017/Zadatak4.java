package zadaci_16_02_2017;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean proces=true;
		int number=0;
		//unos prvog broja
		do{try{System.out.println("Unesite cijeli broj (nula prekida niz) : ");
		number=input.nextInt();
		if(number==0)System.exit(1);
		proces =false;}
		//ispis poruke u slucaju exception-a
		catch(Exception e){System.out.println("Pogresan unos");
			}}while(proces);
		//max broj na pocetku je prvi uneseni broj
		int max=number;
		int count=1;
        //ukoliko je broj razlicit od nule ponavlja se unos
		while (number != 0) {
			// pozivamo metodu koja uzima unos od korisnika
			try{System.out.println("Unesite cijeli broj (unos prekida 0): ");
			number=input.nextInt();
			if (number==0) break;
            //ukoliko je uneseni broj veci od max
			//varijabli max se dodjeljuje vrijednost unesenog broje
			if (max < number) {
				
				max = number;
				count = 1;
			} else if (max == number) {
				//ukoliko je uneseni broj jednak max vrijednosti, povecava se brojac za 1
				count++;
			}
		}catch(Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();}
		}

		input.close();

		// ispis rezultata, najveci broj i broj ponavljanja
		System.out.println("\nNajveci broj je " + max + " i ponavlja se "+ count + " puta.");


	}

}
