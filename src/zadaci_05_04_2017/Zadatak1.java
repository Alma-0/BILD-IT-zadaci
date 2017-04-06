package zadaci_05_04_2017;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zadatak1 {

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		List<E> listWithDuplicates = list;
		List<E> listWithoutDuplicates = listWithDuplicates.parallelStream().distinct().collect(Collectors.toList());
		return (ArrayList<E>) listWithoutDuplicates;

	}

}
