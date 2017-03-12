package zadaci_10_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		try {
			int[] array = new int[Integer.MAX_VALUE];
			System.out.println(array.length);
		} catch (OutOfMemoryError ex) {
			System.out.println("Out of memory!");
		}
	}

}
