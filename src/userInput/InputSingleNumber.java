package userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSingleNumber {
	Scanner scan;
	int from, to;

	public static int inputNumber(Scanner scan, int from, int to) {
		while (true) {
			try {
				int input = scan.nextInt();

				if (input < from || input > to)
					throw new InputMismatchException("not in range");
				return input;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage() == null ? "wrong input" : e.getMessage() + " try again");

				scan.nextLine();
			}
		}

	}

	public static int inputNumber(Scanner scan, int from) {
		while (true) {
			try {
				double input = scan.nextDouble();
				if (input <= from)
					throw new InputMismatchException("not in range");
				else if (input > Integer.MAX_VALUE)
					System.err.printf("Number is not in range, enter smaller number than %d", Integer.MAX_VALUE);
				else return (int) input;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage() == null ? "wrong input" : e.getMessage() + " try again");
				scan.nextLine();
			}
		}
	}

	public static int inputNumber(Scanner scan) {
		while (true) {
			try {
				long input = scan.nextLong();
				if (input > Integer.MAX_VALUE)
					System.err.printf("Number is not in range, enter smaller number than %d\n", Integer.MAX_VALUE);

				else if (input < Integer.MIN_VALUE)
					System.err.printf("Number is not in range, enter greater number than %d\n", Integer.MIN_VALUE);

				else
					return (int) input;
			} catch (InputMismatchException e) {
				System.out.println("Try again");
				scan.nextLine();
			}
		}
	}

}
