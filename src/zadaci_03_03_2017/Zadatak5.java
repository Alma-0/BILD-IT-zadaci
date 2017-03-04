package zadaci_03_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		for (int number = 2; number < 120; number++) {
			if (MyInteger.isPrime(number)) {
				
				stack.push(number);
			}
		}

		
		for (int i = stack.getSize() - 1; i >= 0; i--) {
			System.out.print(stack.getElement(i) + " ");
			if(i%10==0)System.out.println();
		}

	}
}
