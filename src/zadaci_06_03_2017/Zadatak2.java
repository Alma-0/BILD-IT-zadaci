package zadaci_06_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		
		MyString2 newString=new MyString2("danas je nedjelja");
		
		System.out.println(newString.compare("danas nije"));
		System.out.println(newString.compare("danas je nedjelja"));
		System.out.println(newString.substring(2).getS());
		System.out.println(newString.toUpperCase().getS());
		System.out.println(MyString2.valueOf(true).getS());
		
		char[] chars = newString.toChars();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}


	}

}
