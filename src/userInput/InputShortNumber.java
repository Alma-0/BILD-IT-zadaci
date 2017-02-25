package userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputShortNumber {

	public static short inputNumber(Scanner scan, int from, int to) {
		while (true) {
			try {
				short input = scan.nextShort();
				if (input < from || input > to)
					throw new InputMismatchException("Not in range");
				return input;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage() == null ? "wrong input" : e.getMessage() + " try again");
				scan.nextLine();
			}
		}
	}

	public static short inputNumber(Scanner scan, short to) {
		while (true) {
			try {
				short input = scan.nextShort();
				if (input <= 0)
					throw new InputMismatchException("Not in range");
				return input;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage() == null ? "wrong input" : e.getMessage() + " try again");
				scan.nextLine();
			}
		}
	}

	public static short inputNumber(Scanner scan) {
		while (true) {
			try {
				return scan.nextShort();
			} catch (InputMismatchException e) {
				System.out.println("Wrong input, try again");
				scan.nextLine();
			}
		}

	}

}
