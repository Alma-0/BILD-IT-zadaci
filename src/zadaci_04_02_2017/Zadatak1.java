package zadaci_04_02_2017;

import java.math.BigInteger;

public class Zadatak1 {

	public static void main(String[] args) {
		int count = 1;

		String number = 1 + "";
		for (int i = 0; i < 49; i++) {
			number += 0;
		}
		BigInteger bigNumber = new BigInteger(number);

		while (count <= 10) {

			BigInteger divisibleBy2 = bigNumber.remainder(new BigInteger("2"));
			BigInteger divisibleBy3 = bigNumber.remainder(new BigInteger("3"));

			if (divisibleBy2.equals(BigInteger.ZERO) || divisibleBy3.equals(BigInteger.ZERO)) {

				System.out.println(count + ". number is: " + bigNumber);
				count++;
			}
			bigNumber = bigNumber.add(BigInteger.ONE);

		}

	}

}
