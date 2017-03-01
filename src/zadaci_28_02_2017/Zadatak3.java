package zadaci_28_02_2017;

import java.util.Arrays;

public class Zadatak3 {

	public static void main(String[] args) {
		StopWatch o = new StopWatch();
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);

		}
		o.start();
		Arrays.sort(array);
		o.stop();
		System.out.println("Proteklo vrijeme je " + o.getElapdesTime() + " s");

	}

}
