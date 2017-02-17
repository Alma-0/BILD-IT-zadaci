package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		boolean proces=true;
		int x1=0,x2=0;
		int y1=0,y2=0;
		do{try{System.out.println("Unesite geografsku sirinu i gegrafsku duzinu u stepenima za prvu tacku, respektivno");
		x1=input.nextInt();
		y1=input.nextInt();
		System.out.println("Unesite geografsku sirinu i gegrafsku duzinu u stepenima za drugu tacku, respektivno");
		x2=input.nextInt();
		y2=input.nextInt();
		proces=false;
		if(y1<-180||y1>180||x1<-90||x1>90||y2<-180||y2>180||x2<-90||x2>90){
			System.out.println("Unosite geografsku sirinu u intervalu [-90,90], a geografsku duzinu [-180,180]");
			proces=true;}
		
		}
		catch(Exception e){
			System.out.println("Pogresan unos");
			input.nextLine();
			}
		}while(proces);
		double d = 6371.01 * Math.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
        System.out.println("Great circle distance is "+d+" km");
        input.close();
	}

}
