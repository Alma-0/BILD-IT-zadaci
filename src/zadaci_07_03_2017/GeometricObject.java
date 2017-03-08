package zadaci_07_03_2017;

public class GeometricObject {

	private String color = "white";
	private boolean filled=false;
	
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	private java.util.Date dateCreated;

	public GeometricObject(){
		dateCreated=new java.util.Date();
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

}
