package hackathon;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws IOException {
		String fileName = args[0];
		Path path = Paths.get(fileName);
		Scanner line = new Scanner(path);
		while (line.hasNextLine()) {
			String line1 = line.nextLine();
			System.out.println(isValid(line1));
			
			
		}
	}

	public static boolean isValid(String line1) {
		if(!line1.contains("@") || !line1.contains(".") ) return false;
		String[] word = line1.split("@");
		String[] word2 = word[1].split("\\.");
		if (word.length == 2) {
			if ((word2.length == 2) && word2[1].equals("com"))
				return true;
			
			else return false;
			
		} else
			return false;

	}

}
