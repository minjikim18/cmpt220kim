import java.util.Scanner;

public class TriangleExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the three sides of a triangle
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Prompt user to enter a color
		System.out.println("Enter a color: ");
		String color = input.next();
		
		// Ask user if the triangle is filled or not
		System.out.println("Is the triangle filled or not? true/false: ");
		boolean filled = input.nextBoolean();
		
		// Create a new triangle with given inputs
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFiiled(filled);
		
		// Display outputs
		System.out.println(triangle.toString());
		System.out.println("Area of the triangle is " + triangle.getArea());
		System.out.println("Perimeter of the triangle is " + triangle.getPerimeter());
		System.out.println("Color of the triangle is " + triangle.getColor());
		System.out.println("Triangle is filled or not: " + triangle.isFilled());

	}

}
