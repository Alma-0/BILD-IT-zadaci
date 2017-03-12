package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {

		String fileName = args[0];
		String stringToRemove = args[1];

		ArrayList<String> list = new ArrayList<>();
		copyFile(list, fileName);
		removeString(list, stringToRemove);
		copyString(list, fileName);

	}

	public static void removeString(ArrayList<String> list, String stringRemove) {

		int counter = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(stringRemove)) {
				list.remove(i);
				counter++;
			}
		}

		if (counter == 0) {
			System.out.println("There was no such string in this file.");
		} else {
			System.out.println(counter + " occurences of '" + stringRemove + "' are successfully removed.");
		}
	}

	public static void copyFile(ArrayList<String> list, String fileName) throws IOException {

		Path path = Paths.get("src/zadaci_10_03_2017/" + fileName);

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader reader = Files.newBufferedReader(path);
		String line = "";

		while ((line = reader.readLine()) != null) {
			String[] words = line.split(" ");

			for (int i = 0; i < words.length; i++) {
				list.add(words[i]);
			}

			list.add("|||");
		}

		reader.close();
	}

	public static void copyString(ArrayList<String> list, String fileName) throws IOException {

		Path path = Paths.get("src/zadaci_10_03_2017/" + fileName);

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedWriter writer = Files.newBufferedWriter(path);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("|||")) {
				writer.newLine();
			} else {
				writer.write(list.get(i) + " ");
			}
		}

		writer.close();
	}
}
