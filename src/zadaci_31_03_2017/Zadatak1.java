package zadaci_31_03_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
		GeometricObject circle1 = new Circle(2);
		GeometricObject circle2 = new Circle(9);
		GeometricObject circle3 = new Circle(9);
		
		
		System.out.println("Is equals? " + circle1.equals(circle2));
		System.out.println("Is equals? " + circle2.equals(circle3));


	}

}
