package zadaci_04_02_2017;

import java.math.BigInteger;

public class Zadatak4 {

	public static void main(String[] args) {
		BigInteger p;

		System.out.printf("%-10s%10s\n\n", "p", "2^p - 1");

		for (p = new BigInteger("2"); p.compareTo(new BigInteger("100")) <= 0; p = p.add(BigInteger.ONE)) {
			if (isPrime(p)) {
				// check if p is prime
				BigInteger mersennePrime = new BigInteger("2").pow(p.intValue()).subtract(BigInteger.ONE);

				if (isPrime(mersennePrime)) {
					
					System.out.printf("%-10s%10s\n", p, mersennePrime);
				}

			}
		}
	}

	public static boolean isPrime(BigInteger num) {

		for (BigInteger i = new BigInteger("2"); i.compareTo(num) == -1; i = i.add(BigInteger.ONE)) {
			if (num.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}

		}
		return true;
	}

}
