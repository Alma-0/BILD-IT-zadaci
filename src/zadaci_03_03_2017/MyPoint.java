package zadaci_03_03_2017;

public class MyPoint {

	private double x=0;
	private double y=0;

	
	public MyPoint() {

	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	public double distance(double x2, double y2){
		return Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
	}
	
	public double distance(MyPoint pointA){
		double x1 = this.x;
		double y1 = this.y;
		double x2 = pointA.getX();
		double y2 = pointA.getY();

		return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
	}

}
