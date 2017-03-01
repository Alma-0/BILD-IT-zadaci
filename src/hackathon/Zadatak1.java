package hackathon;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws IOException {
		ArrayList<Character> list=new ArrayList<>();
		String fileName = args[0];

		Path path = Paths.get(fileName);
		Scanner line = new Scanner(path);
		while (line.hasNextLine()) {
			String line1 = line.nextLine();
			for(int i=0;i<line1.length();i++){
				if(Character.isLetter(line1.charAt(i)))list.add(line1.charAt(i));
				if(Character.isLetter(line1.charAt(i)) && !Character.isLetter(line1.charAt(i+1)))
					list.add(' ');
			}
			
			for (int i = 0; i < list.size(); i++) {
				System.out.print(Character.toLowerCase(list.get(i)));
			}
			System.out.println();
			list.clear();
			
			
				
			}
		}
		

	

}
