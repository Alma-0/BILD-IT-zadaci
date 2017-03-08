package zadaci_07_03_2017;

public class Student extends Person {
	
	private final String status;

	public Student(String name, String address, String phoneNumber, String email,
			String status) {
	
		super(name, address, phoneNumber, email);
		this.status= status;
	}

	public String getSTATUS() {
		return status;
	}

	public String toString() {
		return super.toString() + "\nStatus: " + status;
}

}
