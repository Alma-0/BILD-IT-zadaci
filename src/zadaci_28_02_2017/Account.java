package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;

	}

	Account( int newId, int newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(int newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterest(double newAnnualInterest) {
		annualInterestRate = newAnnualInterest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public int getId() {
		return id;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / (12*100);
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;

	}

}
