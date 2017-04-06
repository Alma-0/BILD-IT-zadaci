package zadaci_05_04_2017;

public class Zadatak5 {

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (key.compareTo(list[middle]) < 0)
				high = middle - 1;

			else if (key.compareTo(list[middle]) > 0)
				low = middle + 1;

			else
				return middle;
		}
		return -low - 1;
	}

}
