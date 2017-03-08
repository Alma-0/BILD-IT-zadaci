package zadaci_06_03_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		char[] arrayCh={'1','2','d','t','7'};
		MyString1 chars1=new MyString1(arrayCh);
		System.out.println(chars1.charAt(2));
		System.out.println(chars1.substring(2, 4).getChars());

	}

}
