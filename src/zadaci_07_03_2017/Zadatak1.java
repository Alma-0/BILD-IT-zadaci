package zadaci_07_03_2017;

import java.util.Scanner;

import userInput.InputDoubleNumber;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lengths of 3 sides of Triangle");
		double side1 = InputDoubleNumber.inputNumber(input);
		double side2 = InputDoubleNumber.inputNumber(input);
		double side3 = InputDoubleNumber.inputNumber(input);

		System.out.println("Enter a color of triangle");
		String color = input.next();
		System.out.println("Triangle is filled (enter true or false)");
		boolean filled = input.nextBoolean();

		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter()
				+ "\nColor of triangle: " + triangle.getColor() + "\nTraingle is filled: " + triangle.isFilled());
	}

}
