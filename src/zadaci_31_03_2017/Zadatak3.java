package zadaci_31_03_2017;

public class Zadatak3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon octagon = new Octagon(5);

		System.out.printf("Octagon:\nArea: %.2f  Perimeter: %.2f \n", octagon.getArea(), octagon.getPerimeter());

		Octagon octagon1 = (Octagon) octagon.clone();

		int result = (octagon.compareTo(octagon1));
		if (result == 1)
			System.out.println("Octagon is greather than clone");
		else if (result == -1)
			System.out.println("Octagon is less than clone."); 
		else
			System.out.println("Octagon is equal to clone.");
}

	}


