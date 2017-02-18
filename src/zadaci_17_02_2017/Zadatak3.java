package zadaci_17_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Ispis parova brojeva, od 0 do 7 (ukljucujuci 7)");
		// kombinacije brojeva u intervalu [1,7]
		for (int i = 1; i <= 7; i++) {
			System.out.println();
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				count++;
			}
		}
		// Ispis rezultata brojaca parova
		System.out.println("NUmber of combinations is " + count);

	}

}
