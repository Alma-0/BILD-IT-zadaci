package zadaci_06_03_2017;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
		String[] array1 = split("ab#12#453", "#");
		String[] array2 = split("a?b?gf#e", "[?#]");

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + ", ");
		}

		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}

	}

	public static String[] split(String s, String regex) {
		String[] array = new String[s.length()];
		int index = 0;

		if (checkRegex(regex)) {
			regex = getRegex(regex);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[index] == null) {
				array[index] = "";
			}

			if (regex.contains(s.charAt(i) + "")) {
				array[index + 1] = s.charAt(i) + "";

				index += 2;
			} else

				array[index] += s.charAt(i);

		}

		ArrayList<String> tempArray = new ArrayList<>();
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				tempArray.add(array[i]);
				counter++;
			} else
				break;

		}

		String[] splitArray = new String[counter];

		for (int i = 0; i < splitArray.length; i++) {
			splitArray[i] = tempArray.get(i);
		}

		return splitArray;
	}

	public static boolean checkRegex(String regex) {
		if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']') {
			return true;
		}

		return false;
	}

	public static String getRegex(String regex) {
		if (checkRegex(regex)) {
			return regex.substring(1, regex.length() - 1);
		}

		return regex;
	}

}
