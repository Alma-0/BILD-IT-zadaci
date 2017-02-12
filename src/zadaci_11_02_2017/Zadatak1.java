package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//novi Scanner
		Scanner input=new Scanner (System.in);
		//referentna vrijednost za kontorolisanje do while bloka
		boolean process=true;
		int num=0;
		//do while blok (i try catch) za sprecavanje pogresnog unosa, broj treba da je cijei i veci od 1
		do{try{System.out.println("Enter one number");
		num=input.nextInt();
		process=false;}
		catch(Exception e){
			//ispis poruke u slucaju pogreske
			System.out.println("Pogresan unos");
			input.nextLine();
		}}while(process||num<2);
		int n=num;
		int count=0;
		int prostBroj=0;
        //pomocu petlje nalazimo najmanje djeljitelje unesenog broja
        for(int i=2; i<=n; i++){
        	count=0;
        	//obzirom da petlja ide od manjih brojeva ukoliko se pronadje djeljitelj on ce biti trenutno ujedno i najmanji djeljitelj
            while(n%i==0){
                n = n/i;
                 count++;
                 prostBroj++;
            }
            
            //ukoliko je djeljitelj pronadjen vrsi se ispis
            if (count != 0) {
                for (int j = count; j > 0; j--) {
                    System.out.print(i);
                    //ukoliko je preostali broj razlicit od 1, vrsi se ispis znaka za mnozenje
                    //time sprjevamo dodavanje znaka nakon ispisa zadnjeg broja
                    if (n != 1) {
                        System.out.print("*");
                    } else System.out.print("="+num);
            
        }

	}
        }//ukoliko broj ima samo jednog djeljitelja onda se dijeli sa samim sobom, to je prost broj
        //takodje se moze pisati kao 1*num
        if (prostBroj==1)System.out.println("\nUneseni broj je prost broj");
        input.close();
        }
}
