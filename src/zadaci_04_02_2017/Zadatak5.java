package zadaci_04_02_2017;

import java.math.BigInteger;

public class Zadatak5 {

	public static void main(String[] args) {
		int count = 1;

		
		BigInteger bigNumber = new BigInteger(Long.MAX_VALUE+"");
        bigNumber=bigNumber.add(BigInteger.ONE);
		while (count <= 10) {

			BigInteger divisibleBy5 = bigNumber.remainder(new BigInteger("5"));
			BigInteger divisibleBy6 = bigNumber.remainder(new BigInteger("6"));

			if (divisibleBy5.equals(BigInteger.ZERO) || divisibleBy6.equals(BigInteger.ZERO)) {

				System.out.println(count + ". number is: " + bigNumber);
				count++;
			}
			bigNumber = bigNumber.add(BigInteger.ONE);

		}

	}

}
