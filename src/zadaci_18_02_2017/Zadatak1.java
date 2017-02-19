package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//kreiranje liste
		ArrayList<String> cities = new ArrayList<>();
		Scanner input = new Scanner(System.in);
        //unos 3 stringa
		for (int i = 0; i < 3; i++) {
			boolean result = true;
			System.out.println("Enter city name");
			String city = input.nextLine();
			city = city.trim();
            //provjera da li string sadrzi samo slova ili prazno polje
			for (int j = 0; j < city.length(); j++) {
                //ukoliko sadrzi drugi znak osim slova ili praznog polja unos nije valjan, ponavlja se
				if (!Character.isLetter(city.charAt(j)) && city.charAt(j) != ' ') {
					System.out.println("Wrong input, try again");
					i--;
					result = false;
					break;
				}

			}
			//ukoliko je unos valjan prvi karakter pretvaramo u veliko slovo
			//preostale karaktereu mala slova
			if (result) {
				city = city.toLowerCase();
				String [] city1=city.split(" ");
				String city2="";
				for (int z=0;z<city1.length;z++){
					char first = Character.toUpperCase(city1[z].charAt(0));
					city2+=(first + city1[z].substring(1)+" ");
				}
				
				cities.add(city2);
			}

		}
		//Sortiranje clanova liste po abecednom redu
		Collections.sort(cities);
		//Ispis rezultata
		System.out.println(
				"Cities are listed alphabetically: " + cities.get(0) + "," + cities.get(1) + "," + cities.get(2));
		input.close();

	}
}
