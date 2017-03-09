package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list=new ArrayList<>();
		
		System.out.println("Enter 5 integer numbers");
		for (int i = 0; i < 5; i++) {
			list.add(InputDoubleNumber.inputNumber(input));
		}
		System.out.println("Sum : "+sum(list));
		

	}
	public static double sum(ArrayList<Double> list){
		double suma = list.stream().mapToDouble(Double::doubleValue).sum();
		return suma;
	}

}
