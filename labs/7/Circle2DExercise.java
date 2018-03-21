
public class Circle2DExercise {

	public static void main(String[] args) {
		
		// Create a new Circle2D object
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		// Displays area and perimeter
		System.out.println("Area of circle 1 is " + c1.getArea());
		System.out.println("Perimeter of cirlce 1 is " + c1.getPerimeter());
		
		// Displays results of contains and overlaps
		System.out.println("x and y is inside circle 1: " + c1.contains(3, 3));
		System.out.println("Specified circle is inside circle 1: " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Specified cirlce overlaps with cirlce 1: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
