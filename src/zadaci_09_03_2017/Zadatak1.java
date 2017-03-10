package zadaci_09_03_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;
import userInput.InputSingleNumber;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of the points:");
		int points = InputSingleNumber.inputNumber(input);
		double[] xPoint = new double[points];
		double[] yPoint=new double[points];
		System.out.println("Enter x and y points");
		for (int i=0;i<points;i++){
			xPoint[i]=InputDoubleNumber.inputNumber(input);
			yPoint[i]=InputDoubleNumber.inputNumber(input);
		}
		double area=0;
		int j=points-1;
		for (int i=0;i<points;i++){
			
			area+=(xPoint[j]+xPoint[i])*(yPoint[j]-yPoint[i]);
			j=i;
		}
		System.out.println(Math.abs(area/2));

		
		
		

		
		
		

	}
}

	
