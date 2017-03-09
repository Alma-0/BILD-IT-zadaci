package zadaci_07_03_2017;

import java.util.Date;

public class Employee extends Person {
	protected String office;
	protected double salary;
	protected Date dateHired=new Date();

	public Employee(String name, String address, String phoneNumber, String email, String office, double salary
			) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		

	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public String toString() {
		return super.toString()+"\nOffice: " + office + ", Salary: " + salary + ", hired date: " + dateHired;
	}

}
