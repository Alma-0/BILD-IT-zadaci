package Zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Unesite password");
		String pass=input.nextLine();
		//brojac slova i brojeva u unesenom Stringu
		int count=0;
		//brojac brojeva u unesenom Stringu
		int count1=0;
		//ukoiko je broj unesenih karaktera veci ili jednak 8, ispunjen je jedan uslov za tacnost paswworda, provjeravamo ostale
		if (pass.length()>=8){
				for (int i=0;i<pass.length();i++){
					if (Character.isLetterOrDigit(pass.charAt(i))) count ++;
					if (Character.isDigit(pass.charAt(i))) count1++;
				}
				//ukoliko su svi karakteri slova i brojevi, ukoliko sadrzi bar 2 broja password je validan
				if ((count==pass.length())&& count1>=2) System.out.println("Password je validan");
				else System.out.println("Password nije validan");
				//ukoliko ima manje od 8 karaktera password nije validan
		} else System.out.println("Password nije validan");
		input.close();
	}

}
