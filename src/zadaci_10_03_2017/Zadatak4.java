package zadaci_10_03_2017;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("mail.txt");
		count(path);

	}

	public static void count(Path path) throws IOException {
		int words = 0;
		int lines = 0;
		int chars = 0;

		Scanner line = new Scanner(path);

		while (line.hasNextLine()) {
			line.nextLine();
			lines++;
		}

		Scanner word = new Scanner(path);

		while (word.hasNext()) {
			String a = word.next();

			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != ' ')
					chars++;
			}
			words++;
		}

		word.close();
		line.close();

		System.out.println("File " + path + ":");

		System.out
				.println("Number of lines: " + lines + "\nNumber of words:" + words + "\nNumber of characters: " + chars);

	}

}
