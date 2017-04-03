package zadaci_03_04_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers");
		int m = InputSingleNumber.inputNumber(input,0);
		int n = InputSingleNumber.inputNumber(input,0);
		System.out.println("Greatest coomon divisor is "+gcd(m,n));

	}

	public static int gcd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);

	}

}
