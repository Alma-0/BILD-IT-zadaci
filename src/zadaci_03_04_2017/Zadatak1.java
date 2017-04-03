package zadaci_03_04_2017;

import java.util.Scanner;

import userInput.InputLongNumber;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		long index = InputLongNumber.inputNumber(input, 0);

		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

	}

	public static long fib(long index) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;

		if (index == 0)
			return f0;
		else if (index == 1)
			return f1;
		else {
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
			return currentFib;
		}
	}

}
