package hackathon;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) throws IOException {
		String fileName = args[0];

		Path path = Paths.get(fileName);
		Scanner line = new Scanner(path);
		while (line.hasNextLine()) {
			String line1 = line.nextLine();
			System.out.println(findFirstLetter(line1));

		}
	}

	public static String findFirstLetter(String word) {
		int count = 0;
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			count=0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j))
					count++;
			}

			if (count == 1) {
				result += word.charAt(i);
				return result;
			}

		}
		return result;

	}

}
