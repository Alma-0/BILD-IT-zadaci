package zadaci_28_02_2017;

public class Location {
	int row;
	int column;
	double max;

	Location(double[][] a) {
		max = a[0][0];
		row = 0;
		column = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}

}
