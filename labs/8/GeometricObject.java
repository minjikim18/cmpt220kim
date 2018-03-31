import java.util.Date;

public class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private Date date;


	public GeometricObject() {
	date = new Date();
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
	
	public void setFiiled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String toString() {
		return "created on " + date + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}

