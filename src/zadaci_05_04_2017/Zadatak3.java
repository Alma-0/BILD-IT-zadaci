package zadaci_05_04_2017;

public class Zadatak3 {

	public static <E extends Comparable<E>> E max(E[] list) {
		E maxValue = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(maxValue) > 0 )
				maxValue = list[i];
		}
		return maxValue;
	}

}
