package zadaci_06_03_2017;

public class MyStringBuilder1 {
	
	private String s;

	public MyStringBuilder1(String s) {
		this.s = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		String newS  = this.s; 
		newS += s;
		return new MyStringBuilder1(newS);
	}

	public MyStringBuilder1 append(int i) {
		String newS  = this.s; 
		newS += i + "";
		return new MyStringBuilder1(newS);
	}

	public int length() {
		return s.length();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}

	public MyStringBuilder1 toLowerCase() {
		String newS = "";
		for (int i = 0; i < this.length(); i++) {
			if (this.charAt(i) <= 'Z') {
				newS += (char)(this.charAt(i) + 32);
			}
			else newS+=this.charAt(i);
		}
		return new MyStringBuilder1(newS);
	}

	public MyStringBuilder1 substring(int begin, int end) {
		String newS = "";
		for (int i = begin; i < end; i ++) {
			newS += s.charAt(i);
		}
		return new MyStringBuilder1(newS);
	}

	public String toString() {
		return s;
}

}
