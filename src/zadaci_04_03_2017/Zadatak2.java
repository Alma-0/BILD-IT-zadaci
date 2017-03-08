package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		
	int count = 1;

	String number = Long.MAX_VALUE+"";
	BigInteger numberCompare = new BigInteger(number);

	long result=(long) Math.sqrt(Long.MAX_VALUE);

	BigInteger numberSq = new BigInteger(result+"");

	while (count <= 10) {

		BigInteger num =numberSq.multiply(numberSq);
		
		if (num.compareTo(numberCompare)==1 ) {

			System.out.println(num);
			count++;
		}
		numberSq = numberSq.add(BigInteger.ONE);

	}

}

}
