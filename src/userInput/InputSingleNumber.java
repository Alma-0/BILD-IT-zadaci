package userInput;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSingleNumber {
	Scanner scan;
	int from, to;
	
	
	public static int  inputNumber(Scanner scan,int from, int to){
		while(true){
			try{
				int input=scan.nextInt();
				if(input<from || input>to)
					throw new InputMismatchException("not in range");
				return input;
			} catch(InputMismatchException e){
				System.out.println(e.getMessage()==null ? "wrong input":e.getMessage()+"try again");
				scan.nextLine();
			}
		}
	}
	
	public static int  inputNumber(Scanner scan, int to){
		while(true){
			try{
				int input=scan.nextInt();
				if(input<=0)
					throw new InputMismatchException("not in range");
				return input;
			} catch(InputMismatchException e){
				System.out.println(e.getMessage()==null ? "wrong input":e.getMessage()+" try again");
				scan.nextLine();
			}
		}
	}
	
	public static int inputNumber(Scanner scan){
		while(true){
			try{
				return scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Wrong input");
				scan.nextLine();
			}
		}
	}

}
