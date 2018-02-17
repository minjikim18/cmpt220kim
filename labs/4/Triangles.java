import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt users to enter three sides of a triangle
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Check if triangle is valid. If valid, print area. If invalid, print invalid input
		if (isValid(side1, side2, side3)) {
			System.out.println("Area of triangle is " + area(side1, side2, side3));
		} else {
			System.out.println("Input is invalid. Not a valid triangle");
		}
			
		
	}

	// Method to find triangle area
	private static double area(double side1, double side2, double side3) {
		double triangleArea = 0;
		double side4 = 0;
		side4 = (side1 + side2 + side3 )/ 2 ;
        triangleArea = Math.sqrt(side4 * (side4 - side1) * (side4 - side2) *
        		(side4 - side3));
		return triangleArea;
	} 
	

	// Method to check whether the triangle is valid or not
	private static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
	    return true;
		return false;
	}

}
