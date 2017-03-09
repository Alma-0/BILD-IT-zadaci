package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak4 {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		Object date=new Date();
		Object loan=new Loan();
		Object string=new String("Ponedjeljak");
		Object circle=new Circle();
		
		list.add(date);
		list.add(loan);
		list.add(string);
		list.add(circle);
		
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}

	}

}
