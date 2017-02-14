package Zadaci_13_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//novi niz od 52 clana
		int[] decks = new int[52];
		int index=0;
		//niz u kojem su spremljeni znakovi karti
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		//niz u kojem su spremljeni brojevi karti
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        //dodjeljivanje clanova nizu decks
		for(int i = 0; i < decks.length; i++){
			decks[i] = i;
		}
		//dodjeljivanje vrijednosti karti nizu
		for (int i = 0; i<decks.length;i++){
			//dodjeljivanje random broja indexu
			index = (int)(Math.random() * 52);
			
		}
        //odredjivanje znaka karte i broj karte
			String suit = suits[decks[index] / 13];
		    String rank = ranks[decks[index] % 13];
		    System.out.println("Card is " + rank + " of " + suit);
		}
	}


