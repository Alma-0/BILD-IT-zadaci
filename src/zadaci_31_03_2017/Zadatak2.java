package zadaci_31_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		
		GeometricObject rectangle1 = new Rectangle(1, 2);
		GeometricObject rectangle2 = new Rectangle(3, 4);
		GeometricObject rectangle3 = new Rectangle(1, 2);
		
		System.out.println("Is equals? " + rectangle1.equals(rectangle2));
		System.out.println("Is equals? " + rectangle1.equals(rectangle3));

		

	}

}
