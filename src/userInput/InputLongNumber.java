package userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputLongNumber {
	Scanner scan;
	int from, to;
	
	
	public static long inputNumber(Scanner scan,long from, long to){
		while(true){
			try{
				long input=scan.nextLong();
				if(input<from || input>to)
					throw new InputMismatchException("Not in range");
				return input;
			} catch(InputMismatchException e){
				System.out.println(e.getMessage()==null ? "wrong input":e.getMessage()+" try again");
				scan.nextLine();
			}
		}
	}
	
	public static long inputNumber(Scanner scan, long to){
		while(true){
			try{
				long input=scan.nextLong();
				if(input<=0)
					throw new InputMismatchException("Not in range");
				return input;
			} catch(InputMismatchException e){
				System.out.println(e.getMessage()==null ? "wrong input":e.getMessage()+" try again");
				scan.nextLine();
			}
		}
	}
	
	public static  long inputNumber(Scanner scan){
		while(true){
			try{
				return scan.nextLong();
			}catch(InputMismatchException e){
				System.out.println("Wrong input, try again");
				scan.nextLine();
			}
		}
	}

}
