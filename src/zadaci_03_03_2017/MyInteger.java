package zadaci_03_03_2017;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++)
			if (value % i == 0)
				return false;
		return true;
	}

	public static boolean isEven(int value) {
		MyInteger number = new MyInteger(value);
		return number.isEven();
	}

	public static boolean isOdd(int value) {
		MyInteger number = new MyInteger(value);
		return number.isOdd();
	}

	public static boolean isPrime(int value) {
		MyInteger number = new MyInteger(value);
		return number.isPrime();
	}

	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}

	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}

	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}

	public boolean equals(int value) {
		return this.value==value;

	}
	public boolean equals(MyInteger number){
		return number.getValue()==value;
	}
	public static int parseInt(char[] array){
		String number="";
		
		for (int i=0;i<array.length;i++){
			number+=array[i];
		}
		return Integer.parseInt(number);
	}
	public static int parseInt(String word){
		return Integer.parseInt(word);
	}
	
	

}
