package zadaci_28_02_2017;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		
		System.out.println("Unesite cjelobrojne vrijednosti prve matrice dimenzija 3X3 (interval unosa [-1000,1000])");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				array1[row][col] = InputSingleNumber.inputNumber(input, -1000, 1000);
			}
		}
		System.out.println("Unesite cjelobrojne vrijednosti druge matrice dimenzija 3X3 (interval unosa [-1000,1000])");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				array2[row][col] = InputSingleNumber.inputNumber(input, -1000, 1000);
			}
		}
		if(equals(array1,array2))System.out.println("Matrice su identicne");
		else System.out.println("Matrice nisu identicne");

	}
	public static boolean equals(int[][] m1, int[][] m2){
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if(m1[row][col]!=m2[row][col])
					return false;
			}
		}
		return true;
	}
	

}
