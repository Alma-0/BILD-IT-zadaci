package zadaci_09_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pocetna vrijednost sum (ukupan broj prestupnih godina)
		int sum=0;
		//pocetna vrijednost brojaca redova za ispis
		int count=0;
		//preko petlje postavljamo uslov za prestupne godine, prestupne godine su djeljive sa 4 ali ne sa 100, i svaka 400-ta godina
		//vremenski period izmedju dvije prestupne godine je 4 ili 8 godina
		for (int i=101;i<=2100;i++){
			if (((i%4==0)&&(i%100!=0))||(i%400==0)){
				//ukoliko je uslov zadovoljen povecavamo brojac
				sum++;
				////ukoliko je uslov zadovoljen povecavamo brojac
				count++;
				//ispis
				System.out.print(i+" ");
				//ukoliko je ispisano 10 godina u jednom redu prelazi u novi red
				if (count%10==0)System.out.println();	
			}
		}
		//ispis rezultata
        System.out.println("\nUkupan broj prestupnih godina iznosi: "+sum);

	}

}
