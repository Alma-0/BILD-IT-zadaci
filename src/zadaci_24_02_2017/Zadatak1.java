package zadaci_24_02_2017;
import userInput.InputSingleNumber;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite broj u intervalu [1,126]");
		int number=InputSingleNumber.inputNumber(input,1,126);
		char letter=(char) number;
		System.out.println("Karakter broja "+number +" je "+letter);
		
		

	}

}
