package hackathon;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak3 {

	
		public static void main(String[] args) throws IOException {
			String fileName = args[0];

			Path path = Paths.get(fileName);
			Scanner line = new Scanner(path);
			while (line.hasNextLine()) {
				String line1 = line.nextLine();
				if(line1.length()<=55) System.out.println(line1);
				else {
					for(int i=0;i<40;i++)
						System.out.print(line1.charAt(i));
					System.out.print("... <Read More>\n");
					
				}
			}

			}
		}

	


