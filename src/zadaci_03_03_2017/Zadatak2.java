package zadaci_03_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		MyInteger integer1=new MyInteger(5);
		MyInteger integer2=new MyInteger(15);
		String number1="20";
		char[] letter={'5','6'};
		int num=3;
		System.out.println("Number: "+integer1.getValue());
		System.out.println("Number is even: "+integer1.isEven());
		System.out.println("Number is odd: "+integer1.isOdd());
		System.out.println("Number is prime: "+integer1.isPrime());
		
		System.out.println("Number "+num+" is even "+ MyInteger.isEven(num));
		System.out.println("Number "+num+" is odd "+ MyInteger.isOdd(num) );
		System.out.println("Number "+num+" is prime "+ MyInteger.isPrime(num) );
		
		System.out.println("Number "+integer2.getValue()+"is even: "+MyInteger.isEven(integer2));
		System.out.println("Number "+integer2.getValue()+" is odd: "+MyInteger.isOdd(integer2));
		System.out.println("Number "+integer2.getValue()+" is prime: "+MyInteger.isPrime(integer2));
		
		System.out.println(integer2.getValue()+" is equals "+num+":"+integer1.equals(num));
		System.out.println(integer2.getValue()+" is equals "+integer1.getValue()+":"+integer1.equals(integer2));
		
		System.out.println("Chars - number "+MyInteger.parseInt(letter));
		System.out.println("String "+MyInteger.parseInt(number1));
		
		

	}

}
