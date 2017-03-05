package zadaci_04_02_2017;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		int count=1;
		
		BigInteger longMaxNum = new BigInteger(Long.MAX_VALUE+"");
		longMaxNum =longMaxNum .add(BigInteger.ONE);
		
		while(count<=5){
			if(isPrime(longMaxNum)){
				System.out.println(longMaxNum);
				count++;
		}
			longMaxNum=longMaxNum.add(BigInteger.ONE);
	}
	}

	public static boolean isPrime(BigInteger num) {

		for (BigInteger i = new BigInteger("2"); i.compareTo(num) ==-1; i = i.add(BigInteger.ONE)) {
			if (num.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}
			
		}
		return true;
	}

}
