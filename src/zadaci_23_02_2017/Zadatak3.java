package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean proces = true;
		while (proces) {
			System.out.println("Enter SSN (Format DDD-DD-DDDD)");
			String ssn = input.nextLine();
			boolean isSSNValid = ssn.matches("\\d{3}-\\d{2}-\\d{4}");
			if (isSSNValid) {
				System.out.println(ssn + " is a valid social security number");
				proces = false;
			} else
				System.out.println(ssn + " is a invalid social security number");

		}
		input.close();
	}

}
