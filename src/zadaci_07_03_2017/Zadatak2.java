package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import userInput.InputSingleNumber;

public class Zadatak2 {

	public static void main(String[] args) {
		Person person1 = new Person("Person 1", "Address 1", "061/123-456", "person1@gmail.com");
		Person person2 = new Student("Person 2", "Address 2", "062/123-456", "person2@gmail.com", "senior");
		Person person3 = new Employee("Person 3", "Address 3", "063/123-456", "person3@gmail.com", "Office", 1500);
		Person person4 = new Faculty("Person 4", "Address 4", "064/123-456", "person4@gmail.com", "Office", 3000, 7,
				"Director");
		Person person5 = new Staff("Person 5", "Address 5", "065/123-456", "person5@gmail.com", "Office", 3500,
				"Director");

		// testing toString method
		System.out.println(person1.toString());
		System.out.println("\n" + person2.toString());
		System.out.println("\n" + person3.toString());
		System.out.println("\n" + person4.toString());
		System.out.println("\n" + person5.toString());

	}

}
