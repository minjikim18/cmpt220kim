import java.util.Scanner;

public class IllegalTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create new triangle object
		Triangle triangle1 = new Triangle();
		
		// Check and see if the given sides of a triangle is valid or invalid
		try {
			triangle1 = new Triangle(3, 5, 8);
		} catch (IllegalTriangleException ex) {
			System.out.println("Error, Invalid triangle!");
			
		}

	}

}
