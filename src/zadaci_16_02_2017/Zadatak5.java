package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	public static String convertMillis(long millis){
		long totalSeconds=millis/1000;
		long currentSecond=totalSeconds%60;
		long totalMinutes=totalSeconds/60;
		long currentMinute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentHour=totalHours%24;
		return "Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		boolean proces=true;
		long millis=0;
		do{try{System.out.println("Unesite broj milisekundi, unesite cijeli pozitivan broj");
		millis=input.nextLong();
		if(millis==Math.round(millis)){
			proces=false;
		}
		}
		catch(Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();
			}
		}while(proces || millis<=0);
		System.out.println( convertMillis(millis));
		input.close();
		

	}

}
