package zadaci_28_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: " + account.getBalance() + "\nMonthly interest: " + account.getMonthlyInterest()
				+ "\nDate when the account was created :" + account.getDateCreated());

	}

}
