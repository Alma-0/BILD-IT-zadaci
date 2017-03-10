package zadaci_09_03_2017;

import java.util.Date;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan() {
		annualInterestRate = 2.5;
		numberOfYears = 1;
		loanAmount = 2500;
		loanDate = new Date();
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate > 0) {
			this.annualInterestRate = annualInterestRate;
		} else {
			throw new IllegalArgumentException();
		}

	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears > 0) {
			this.numberOfYears = numberOfYears;
		} else {
			throw new IllegalArgumentException();
		}

	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount > 0) {
			this.loanAmount = loanAmount;
		} else
			throw new IllegalArgumentException();
	}

	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;

		return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public String toString() {
		return "Annual interest rate: " + annualInterestRate + ", Years: " + numberOfYears + ", Ammount: " + loanAmount
				+ ", Date: " + loanDate;
	}

}
