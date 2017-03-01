package hackathon;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite jedan string");
		String word = input.nextLine();
		for (int i = 0; i < word.length(); i++) {
			list.add(word.charAt(i));
		}
		for (int i=list.size()-1;i>0;i--){
			if(list.get(i).equals(list.get(i-1))){
				list.remove(i);
			}
		}
		String newWord="";
		for (int i = 0; i < list.size(); i++) {
			newWord+=list.get(i);
		}
		System.out.println(newWord);
		input.close();

	}

}
