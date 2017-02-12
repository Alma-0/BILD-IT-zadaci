package zadaci_11_02_2017;

public class Zadatak4 {
	public static void randomNumCase(){
		//ispis poruke
		System.out.println("Nasumcina slova\n ");
		//ispis 100 nasumicnih velikih slova
		for (int i=1;i<=100;i++){
			System.out.print((char)((Math.random()*26)+65) +" ");
			//ispis 10 slova po jednoj liniji
			if (i%10==0) System.out.println();
		}
		//ispis poruke
		System.out.println("\nNasumcini brojevi\n ");
		//ispis 100 nasumicnih brojeva od 0 do 100
		for (int i=1;i<=100;i++){
			System.out.printf("%4d", (int)(Math.random()*101));
			//ispis 10 brojeva po jednoj liniji
			if (i%10==0) System.out.println();
		}
	}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//poziv metode
		randomNumCase();
		

	}

}
