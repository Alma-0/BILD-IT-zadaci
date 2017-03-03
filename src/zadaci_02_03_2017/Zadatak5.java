package zadaci_02_03_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y2, x2, y2, x3, y3, x4, y4: interval[-100,100]");
		double x1=InputDoubleNumber.inputNumber(input,-100,100);
		double y1=InputDoubleNumber.inputNumber(input,-100,100);
		double x2=InputDoubleNumber.inputNumber(input,-100,100);
		double y2=InputDoubleNumber.inputNumber(input,-100,100);
		double x3=InputDoubleNumber.inputNumber(input,-100,100);
		double y3=InputDoubleNumber.inputNumber(input,-100,100);
		double x4=InputDoubleNumber.inputNumber(input,-100,100);
		double y4=InputDoubleNumber.inputNumber(input,-100,100);
		
		double a=y1-y2;
		double b=x1-x2;
		double c=y3-y4;
		double d=x3-x4;
		double e=a*x1-b*y1;
		double f=c*x3-d*y3;
		
		LinearEquation equation1=new LinearEquation(a,b,c,d,e,f);
		if(equation1.isSovable())
			System.out.printf("The intersecting point is at (%.5f,%.5f)",equation1.getX(),equation1.getY());
		else System.out.println("The two lines are parallel");
		input.close();
	}

}
