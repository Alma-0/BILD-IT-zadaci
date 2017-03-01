package hackathon;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite dva cijela broja u intervalu [1,10000] ");
		int number1=InputSingleNumber.inputNumber(input, 1,10000);
		int number2=InputSingleNumber.inputNumber(input, 1,10000);
		if(number2<number1){
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		int count=0;
		for (int i=number1;i<=number2;i++){
			if(isPrime(i))count++; 
		}
		System.out.println(count);

	}
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
