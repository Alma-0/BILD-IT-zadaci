package zadaci_16_02_2017;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean process=true;
		int numWeek=0;
		int numFut=0;
		Scanner input=new Scanner (System.in);
		do{ try{ System.out.println("Unesi broj za danasnji dan (0-Pon, 1-Uto, 2-Sri, 3-Cet, 4-Pet, 5-Sub, 6-Ned)");
		numWeek=input.nextInt();
		System.out.println("Unesi broj dana nakon danasnjeg dana");
		numFut=input.nextInt();
		process=false;
		if(numWeek<0 ||numWeek>6 ){ System.out.println("Broj za danasnji dan mora biti u intervalu [0,6]");
		process=true;
		}
		}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Pogresan unos");
			input.nextLine();}
		}while(process);
		
		String [] week={"Ponedjeljak", "Utorak", "Srijeda", "Cetvrtak", "Petak", "Subota", "Nedjelja"};
		System.out.println("Danas je "+week[numWeek]+" a dan u buducnosti je "+week[(numWeek+numFut)%7]);
		input.close();

	}

}
