package Zadaci_15_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, iskljuèujuæi sebe
		//provjera uslova, ukoliko je zadovoljen uslov ispis broja
		System.out.println("Savrseni brojevi su: ");
		for (int i=1;i<10000;i++){
			for (int j=1;j<i;j++){
				if (i%j==0){
					sum+=j;
				}
			}
			if (sum==i){
				System.out.println(i+" ");
			}
			sum=0;
		}

	}

}
