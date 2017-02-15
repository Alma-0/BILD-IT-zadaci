package Zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	//nova metoda
	public static int reverse(int number){
		int result=0;
		//novi broj koji predstavlja inverzni broj unesenog
		while(number!=0){
			result=result*10;
			result+=(number%10);
			number/=10;
		}
		return result;
	}
	public static boolean isPalindrome(int number){
		if(number<0) return false;
		//ukoliko je uneseni broj jednak svojoj inverziji onda je on palindrom, vraca true
		if (number==reverse(number))return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		int num=0;
		boolean process=true;
		//kontrolisanje unosa podataka
		do{ try{ System.out.println("Enter one number ");
		 num=input.nextInt();
		process=false;
		}
		catch (Exception e){
			//ispis u slucaju exception-a
			System.out.println("Wrong input");
			input.nextLine();}
		}while(process );
		//poziv metode, ispis rezultata
		System.out.println("Number is palindrome: "+isPalindrome(num));
		if(num<0)System.out.println("Negative number isn't palindrome");
		input.close();

	}

}
