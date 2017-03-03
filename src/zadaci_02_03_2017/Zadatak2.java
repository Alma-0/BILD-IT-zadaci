package zadaci_02_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		RegularPolygon poligon1=new RegularPolygon();
		RegularPolygon poligon2=new RegularPolygon(6,4);
		RegularPolygon poligon3=new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.printf("Poligon 1:\n Perimeter: %.3f\n Area:%.3f\n",poligon1.getPerimeter(),poligon1.getArea());
		System.out.printf("Poligon 2:\n Perimeter: %.3f\n Area:%.3f\n",poligon2.getPerimeter(),poligon2.getArea());
		System.out.printf("Poligon 3:\n Perimeter: %.3f\n Area:%.3f\n",poligon3.getPerimeter(),poligon3.getArea());

	}

}
