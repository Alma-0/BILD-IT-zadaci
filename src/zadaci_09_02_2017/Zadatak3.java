package zadaci_09_02_2017;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//varijabli fileName dodjeljuje se argument (koja je proslijedjena iz druge metode)
		String fileName = args[0];
		//putanja do file-a
		Path path = Paths.get(fileName);
		//kreiran Scanner objekt
		//pomocu Scanner-a i proslijedjenje putanje pristupa se file-u
		Scanner line = new Scanner(path);
		
		//brojac rijeci, linija i karaktera postavljen na nulu
         int words = 0;
         int lines = 0;
         int chars = 0;
         
         //petljom prolazimo kroz upisane redove
         while(line.hasNextLine())
         {
             line.nextLine();
             //brojac linija povecava vrijednost
             lines++;
         }
         //novi Scanner
         Scanner word = new Scanner(path);
         
         //petljom prolazimo kroz upisane rijeci
         while(word.hasNext())
         {
             String a=word.next();
             //pomocu petlje brojimo karaktere svake rijeci
             for (int i = 0; i < a.length(); i++){
					if(a.charAt(i) != ' ')
					chars ++;
				}
             words++;
         }

         //zatvaranje Scanner-a
         word.close();
         line.close();
         
         //ispis rezultata
         System.out.println("Number of lines: " + lines);
         System.out.println("Number of words: " + words);
         System.out.println("Number of characters: " + chars);

	}

}
