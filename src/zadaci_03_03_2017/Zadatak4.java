package zadaci_03_03_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer number greater than 1");

		int number = InputSingleNumber.inputNumber(input,1);
		StackOfIntegers stack = new StackOfIntegers();
        int div=2; 
        
		while (number > 1) {
			if (number % div == 0) {
				stack.push(div);
				number = number / div;
			} else {
				div++;
			}
		}

		
		for (int i = stack.getSize() - 1; i >= 0; i--) {
			System.out.print(stack.getElement(i) + " ");
}

	}

}
