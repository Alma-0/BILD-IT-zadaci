package kalendar;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;



public class Calendar {
	
	public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }

	// return true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
    }
    
    public static void CalenarPrint(int year, int month){
  	  
    	
        
        // months[i] = name of month i
        String[] months = {
            "",                               // leave empty so that months[1] = "January"
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        // days[i] = number of days in month i
        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // check for leap year
        if (month == 2 && isLeapYear(year)) days[month] = 29;


        // print calendar header
        System.out.println("\t" + months[month] + " " + year);
        System.out.println("\n  S   M  Tu   W   Th  F   S");
        System.out.println("-----------------------------");

        // starting day
        int d = day(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++)
        	System.out.print("    ");
        for (int i = 1; i <= days[month]; i++) {
        	System.out.printf("%3d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
            
        }
  }
    public static void choice(){
    	boolean process=true;
		int year=0;
		int month=0;
		Scanner input=new Scanner(System.in);
		do {try{ 
			System.out.println("Enter number of year and month, respectively ");
         year=input.nextInt(); 
         month=input.nextInt();
         process=false;
         if(year<=0 || month<=0) {
        	 System.out.println("number must be greater than 0");
        	 process=true;
         }
         if (month>12) {
        	 System.out.println("Choose number between 1 and 12 - interval [1,12]");
        	 process=true;
         } 
		}catch(Exception e){
			System.out.println("Wrong input");
			input.nextLine();
		}}while(process);
		CalenarPrint(year, month); 
		
    }
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> reminder=new ArrayList<>();
		boolean process=true;
		int year=0;
		int month=0;
		Scanner input=new Scanner(System.in);
		
		
		do {try{ 
			System.out.println("Enter number of year and month, respectively ");
         year=input.nextInt(); 
         month=input.nextInt();
         process=false;
         if(year<=0 || month<=0) {
        	 System.out.println("number must be greater than 0");
        	 process=true;
         }
         if (month>12) {
        	 System.out.println("Choose number between 1 and 12 - interval [1,12]");
        	 process=true;
         } 
		}catch(Exception e){
			System.out.println("Wrong input");
			input.nextLine();
		}}while(process);
		CalenarPrint(year, month); 
        
         
         int option=0;
         
        do{try{ System.out.println("\nEnter one number \nIf you want to add reminder for this month choose: 0\n"
        		+ "If you want to choose calendar for another month choose: 1\n"
        		+ "If you want to exit choose: 2");
         option=input.nextInt();
         process=false;
         if (option!=1 && option!=0 && option!=2) {
        	 System.out.println("Wrong input.Choose 0, 1 or 2");
        	 process=true;
         }
         }catch(Exception e){
        	 System.out.println("Wrong input");
 			input.nextLine();
 		}}while(process);
        int dayReminder=0; 
        
        if (option==0){				
        	process=true;
        	do {
        		try { System.out.println("Choose day:");
                      dayReminder=0;
        			  dayReminder=input.nextInt();
        			  process=false;
        			if(dayReminder<=0){
        				System.out.println("Number must be grater than 0");
        				process=true;}
        			}catch(Exception e){ 
        				 System.out.println("Wrong input");
        				 input.nextLine();
        				 }}while(process);
        								 
           System.out.println("Enter your reminder:");
           input.nextLine();
 	       String obligation=input.nextLine();							 
       
        String remind=dayReminder+"."+month+"."+year+"-"+obligation;
        //ispis 
        System.out.println(remind);
        Filee file1=new Filee(reminder, remind);						
        file1.add(remind);
       
        }		
        	
         if (option==1){
        	choice();
        } 
        if(option==2){
        	System.out.println("Bye");
        	System.exit(1);
        }
        
       input.close();
        	
        
        	}
        }