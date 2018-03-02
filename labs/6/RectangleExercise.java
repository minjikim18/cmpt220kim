
public class RectangleExercise {

	public static void main(String[] args) {
		
		// Create object for Rectangle 
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		// Display width, height, area, and perimeter for rectangle 1
		System.out.println("Rectangle1: ");
		System.out.println("Width of Rectangle 1 is " + rectangle1.width);
		System.out.println("Height of Rectangle 1 is " + rectangle1.height);
		System.out.println("Area of Rectangle 1 is " + rectangle1.getArea());
		System.out.println("Perimeter of Rectangle 1 is " + rectangle1.getPerimeter());
		
		// Display width, height, area, and perimeter for rectangle 2
		System.out.println("Rectangle2: ");
		System.out.println("width of Rectangle 2 is " + rectangle2.width);
		System.out.println("Height of Rectangle 2 is " + rectangle2.height);
		System.out.println("Area of Rectangle 2 is " + rectangle2.getArea());
		System.out.println("Permieter of Rectangle 2 is " + rectangle2.getPerimeter());
	}

}

