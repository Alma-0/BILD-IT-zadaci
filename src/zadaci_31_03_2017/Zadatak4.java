package zadaci_31_03_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		
		GeometricObject[] geometricList = new GeometricObject[4];

		geometricList[0] = new Circle(1);
		geometricList[1] = new Circle(2);
		geometricList[2] = new Rectangle(3, 5);
		geometricList[3] = new Rectangle(4, 6);

		System.out.printf("The sum of the areas: %.3f",sumArea(geometricList));

	}

	
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}

		return sum;
}

	

}
