
public class Square extends GeometricObject implements Colorable {

	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return (Math.pow(side, 2));
	}

	@Override
	public double getPerimeter() {
		return 2 * (side + side);
	}
	
	@Override
	public String howToColor() {
		return "Color all four sides";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
		+ "\nPerimeter: " + getPerimeter();
	}

}
