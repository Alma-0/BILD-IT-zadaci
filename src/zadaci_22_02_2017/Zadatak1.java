package zadaci_22_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		int number=(int)(Math.random()*12+1);
		// String sa nazivima mjeseci
		String [] month={"Januar","Februar","Mart","Maj","Juni","Juli","August","Septembar","Oktobar","Novembar","Decembar"};
		// Ispis mjeseca dobijenog random metodom
		System.out.println("Mjesec: "+month[number-1]);
	}

}
