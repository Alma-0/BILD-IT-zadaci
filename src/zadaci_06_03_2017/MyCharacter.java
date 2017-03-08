package zadaci_06_03_2017;

public class MyCharacter {

	private char nChar;

	public MyCharacter(char nChar) {
		this.nChar = nChar;
	}

	public char charValue() {
		return this.nChar;
	}

	public static boolean isLetter(char nChar) {
		return ((nChar >= 65 && nChar <= 90) || (nChar >= 97 && nChar <= 122));
	}

	public static boolean isDigit(char nChar) {
		return (nChar >= 48 && nChar <= 57);
	}
	
	public static boolean isLetterOrDigit(char nChar) {
		return ((nChar >= 65 && nChar <= 90) || (nChar >= 97 && nChar <= 122)|| (nChar >= 48 && nChar <= 57));
	}

	public static boolean isLowerCase(char nChar) {
		return (nChar >= 97 && nChar <= 122);
	}
	
	public static char toLowerCase(char nChar) {
		if (isLowerCase(nChar)) {
			return nChar;
		}

		return (char) (nChar+ 97 - 65 );
	}

	public static boolean isUpperCase(char nChar) {
		return (nChar >= 65 && nChar <= 90);
	}

	public static char toUpperCase(char nChar) {
		if (isUpperCase(nChar)) {
			return nChar;
		}

		return (char) (nChar + 65- 97 );
	}

	public boolean equals(MyCharacter nChar) {
		return this.nChar == nChar.charValue();
	}

	public static int compare(char ch1, char ch2) {
		if (ch1 == ch2)
			return 0;
		else if ( ch1 < ch2)
			return -1;
		else
			return 1;
	}

}
