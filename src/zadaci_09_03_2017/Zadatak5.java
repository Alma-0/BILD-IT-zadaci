package zadaci_09_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {

		try {
			Loan loan = new Loan(3, 5, 2000);

			loan.setAnnualInterestRate(-5);
			System.out.println(loan.getAnnualInterestRate());
		} catch (IllegalArgumentException ex) {
			System.out.println("Wrong input");
		}

	}

}
