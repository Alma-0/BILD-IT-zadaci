package zadaci_31_03_2017;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	private double side;

	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
	}

	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	public void printOctagon() {
		System.out.println("The circle is created " + getDateCreated() + " and the are is " + getArea());

	}

	public int compareTo(Octagon octagon) {
		if (this.side > octagon.getSide()) {
			return 1;
		} else if (this.side < octagon.getSide()) {
			return -1;
		}

		return 0;
	}

	public double getPerimeter() {
		return side * 8;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
