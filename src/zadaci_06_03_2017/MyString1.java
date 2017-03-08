package zadaci_06_03_2017;

public class MyString1 {
	private char[] chars;


	public char[] getChars() {
		return chars;
	}

	public MyString1(char[] chars) {
		this.chars = chars;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] newChars = new char[end - begin];

		for (int i = 0;i<newChars.length;i++) {
			newChars[i] = this.chars[begin+i];
		}
		MyString1 newChars1 = new MyString1(newChars);
		return newChars1;
	}

	public MyString1 toLowerCase() {
		for (int i = 0; i < chars.length; i++)
			chars[i] = MyCharacter.toLowerCase(this.chars[i]);
		MyString1 charsNew = new MyString1(chars);
		return charsNew;

	}
	public boolean equals(MyString1 s){
		if(this.length()!=s.length())
			return false;
		for (int i=0;i<s.length();i++){
			if (this.charAt(i)!=s.charAt(i))
				return false;
		}
		return true;
	}
	
	public static MyString1 valueOf(int i){
		char[] charsZero = { '0' };
		boolean isNegative = false;

		if (i == 0) {
			return new MyString1(charsZero);
		}

		if (i < 0) {
			i = Math.abs(i);
			isNegative = true;
		}

		int counter = 0;
		int tempValue = i;

		while (tempValue != 0) {
			// counting digits of i
			tempValue = tempValue / 10;
			counter++;
		}

		if (isNegative) {
			counter++;
		}

		char[] chars1 = new char[counter];

		if (isNegative) {
			// if i is less than zero, add a '-' prefix
			chars1[0] = '-';
		}

		for (int j = chars1.length - 1; j >= 0; j--) {
			if (isNegative && j == 0) {
				continue;
			} else {
				int number = i % 10;
				chars1[j] = (char) (48 + number);
				i /= 10;
			}
		}

return new MyString1(chars1);
	}

}
