package zadaci_10_03_2017;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name of file");
		String nameFile = input.next();

		Path path = Paths.get(nameFile);
		File file = new File(nameFile);

		if (!file.exists()) {
			System.out.println("File doesn't exist");
			System.exit(0);
		}
		

			Scanner line = new Scanner(path);

			double sum = 0;
			int count=0;

			
			while (line.hasNextLine()) {
				line.nextLine();
				Scanner number = new Scanner(path);
				while (number.hasNext()) {
					String a = number.next();
					if (isNumeric(a)) {
						sum += Double.parseDouble(a);
						count++;
					}

				}
				number.close();
			}
			System.out.println("Sum of numbers is: "+sum+"\nAverage: "+sum/count);

			line.close();
			input.close();
			
			
		}
	

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?"); 
	}

}
