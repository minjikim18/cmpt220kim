
public class Rectangle {

	double width;
	double height;
	
	// Construct default rectangle
	public Rectangle() {
		this.width = 1.0;
		this.height = 1.0;
	}
	
	// Construct rectangle with specified width and height
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// Return the area of the rectangle
	double getArea() {
		return this.width * this.height;
		
	}
	
	// Return the perimeter of the rectangle
	double getPerimeter() {
		return 2 * (this.width + this.height);
	}
}
