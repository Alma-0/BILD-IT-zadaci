package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	//Nova metoda
	public static void prostBroj (int num1,int num2, int countR) {
		//varijabla pomocu koje se vrsi zamjena unesenih brojeva
		int s;
		//broji redove ispisanih brojeva
		int count=0;
		//zamjena brojeva ukoliko je num1 vece od num2
		if (num1>num2){ s=num1;num1=num2;num2=s;}
		//provjera prime brojeva, ispitujuci sve brojeve u nizu
		for (int i=num1;i<=num2;i++){
			boolean isPrime=true;
			for (int j=2;j<i;j++){
				//ukoliko je uslov ispunjen broj nije prime, izlazak iz petlje
				    if (i%j==0){
					isPrime=false;
					break;
					}
				}
			//broj je prime ukoliko je zadovoljen prethodni uslov i da nije 0 ili 1
				if (isPrime && i!=0 && i!=1){
					count++;
					//ispis prime broja
					System.out.print(i+" ");
					//podesavanje redova ispisa
					if (count%countR==0){
						System.out.println();
						
					}}
				}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//novi Scanner
		Scanner input=new Scanner (System.in);
		//referentne varijable, kontrolisanje ponavljanja petlje
		boolean process1=true;
		boolean process2=true;
		//varijable koje ce sluziti za pohranu brojeva unesenih od strane korisnika
		int num1=0;
		int num2=0;
		int count=0;
		//do while petlja i try catch blok kako bi korisnik bio prinudjen da ponovi unos u slucaju pogreske
		do{  
			try{ System.out.println("Unesite dva broja");
		         num1=input.nextInt();
		         num2=input.nextInt();
		         //po definiciji negativni brojevi ne mogu biti prosti brojevi
		         if(num1>0 && num2>0)process1=false;}
			catch(Exception e){
				//ispis poruke u slucaju exception-a
				System.out.println("Netacan unos. Pokusajte ponovo");
				input.nextLine();
				}
			}while(process1);
		do{ try{System.out.println("Unesite broj za rasporedivanje brojeva po redu");
		        count=input.nextInt();
		if(count>0)process2=false;}
		catch(Exception e){
			System.out.println("Pogresan unos. Pokusajte ponovo");
			input.nextLine();}
		}while(process2);
		//pozivanje metode, ispis rezultata
		prostBroj(num1,num2,count);
		input.close();

	}

}
