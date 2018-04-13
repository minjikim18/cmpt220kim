import java.util.Date;

public abstract class GeometricObject {
	
	private String color;
	private boolean filled;
	private Date date;


	public GeometricObject() {
	date = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		date = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String toString() {
		return "created on " + date + "\ncolor: " + color + 
			" and filled: " + filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}

