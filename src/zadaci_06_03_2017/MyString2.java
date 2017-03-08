package zadaci_06_02_2017;

public class MyString2 {
	private String s;
	

	public String getS() {
		return s;
	}

	public MyString2(String s) {
		this.s = s;
	}

	public int compare(String s) {
		return this.s.compareTo(s);

	}

	public MyString2 substring(int begin) {
		char[] newString = new char[s.length() - begin];

		for (int i = 0; i < newString.length; i++) {
			newString[i] = this.s.charAt(begin + i);
		}
		String newS = String.valueOf(newString);

		return new MyString2(newS);
	}

	public MyString2 toUpperCase() {
		String newS = s.toUpperCase();

		return new MyString2(newS);
	}

	public char[] toChars() {
		char[] chars = new char[this.s.length()];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.s.charAt(i);
		}

		return chars;
	}

	public static MyString2 valueOf(boolean b) {
		String newS = "";

		if (b)
			newS = "true";
		else
			newS = "false";

		return new MyString2(newS);
	}

}
