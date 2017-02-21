package userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDoubleNumber {
	Scanner scan;
	int from, to;
	
	
	public static double  inputNumber(Scanner scan,int from, int to){
		while(true){
			try{
				double input=scan.nextDouble();
				if(input<from || input>to)
					throw new InputMismatchException("not in range");
				return input;
			} catch(InputMismatchException e){
				System.out.println(e.getMessage()==null ? "wrong input":e.getMessage()+"try again");
				scan.nextLine();
			}
		}
	}
	
	public static double  inputNumber(Scanner scan, int from){
		while(true){
			try{
				double input=scan.nextDouble();
				if(input<=0)
					throw new InputMismatchException("not in range");
				return input;
			} catch(InputMismatchException e){
				System.out.println(e.getMessage()==null ? "wrong input":e.getMessage()+" try again");
				scan.nextLine();
			}
		}
	}
	
	public static double inputNumber(Scanner scan){
		while(true){
			try{
				return scan.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("Wrong input, try again");
				scan.nextLine();
			}
		}
	}

}
