package Zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//unos stringa
		System.out.println("Unesite prvi string");
		String s1=input.nextLine();
		System.out.println("Unesite drugi string");
		String s2=input.nextLine();
		int min;
		int i=0;
		//trazenje stringa manje duzine
		if(s1.length()<s2.length()) min=s1.length();
		else min=s2.length();
		int index=0;
		
	    for ( i=0;i<min;i++){
	    	//provjera da li su znakovi na istim pozicijama jednaki
	    	if(s1.charAt(i)!=s2.charAt(i)){
	    		index=i;
	    		//ukoliko znakovi nisu jednaki prekid
	    	break;}
	    	else{//ukoliko nije pronadjen razlicit index = min
	    		index=min;
	    	}
	    }
	    //ukoliko prvi karakter nije isti, stringovi nemaju zajendicki prefix
	    if(s1.charAt(0)!=s2.charAt(0)){
			System.out.println("Uneseni stringovi nemaju zajednicki prefix");
		}else
			//ispis ukoliko zajednicki prefix postoji
	    System.out.println("Najveæi zajednièki prefix za dva stringa je \""+ s1.substring(0, index)+"\"");		
		}
	}


