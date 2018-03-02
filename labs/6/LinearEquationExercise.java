import java.util.Scanner;

public class LinearEquationExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a, b, c, d, e, and f
		System.out.print("Enter a, b, c, d, e, and f ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Create an object for LinearEquation
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		
		// Display restult if equation is solvable
		if (linearEquation.isSolvable()) {
			System.out.print("x is " + linearEquation.getX() + " y is "
												+ linearEquation.getY());
		} else 
			System.out.print("This equation has no solutions");
	}
}
