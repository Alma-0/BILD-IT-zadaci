package zadaci_08_02_2017;


import java.util.ArrayList;
import java.util.Collections;



public class Zadatak1 {
	public static Integer max(ArrayList<Integer> list){
		//postavljamo pocetnu vrijednost koja ce biti ispisana ukoliko je lista prazna
		Integer maxN=null;
		if (list.isEmpty())return maxN;
		//sortiranje clanova liste od najmanjeg ka najvecem Integer objektu
		Collections.sort(list);
		maxN=list.get(list.size()-1);
		return maxN;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		//proizvoljno dodavanje clanova listi, radi testiranja
		list.add(5);
		list.add(9);
		list.add(11);
		//poziv metode i ispis rezultata
		System.out.println("Najveci element liste iznosi "+max(list));

	}

}
