package zadaci_03_03_2017;

public class StackOfIntegers {
	private int[] array;
	private int size;

	public StackOfIntegers() {
		array = new int[20];
	}

	public StackOfIntegers(int capacity) {
		array = new int[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	
	public int last() {
		return array[size - 1];
	}

	
	public void push(int value) {
		if (size >= array.length) {
			int[] temp = new int[array.length * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}

		array[size++] = value;
	}

	
	public int pop() {
		return array[--size];
	}

	public int getSize() {
		return size;
	}

	public int getElement(int index) {
		return array[index];
}

	

}
