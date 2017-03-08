package zadaci_06_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {
		MyStringBuilder1 string1=new MyStringBuilder1("Danas");
		System.out.println(string1.toString());
		System.out.println(string1.append(new MyStringBuilder1(" je")).toString());
		System.out.println(string1.append(1).toString());
		System.out.println(string1.length());
		System.out.println(string1.toLowerCase());
		System.out.println(string1.substring(2, 4).toString());
		
	}
}
