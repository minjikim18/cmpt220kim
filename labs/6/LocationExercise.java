import java.util.Scanner;

public class LocationExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create matrix and declare varialbes
		double[][] matrix;
		int row;
		int column;
		double maxValue;

		// Prompt user to enter number of rows and number of columns
		System.out.println("Enter the number of rows: ");
		row = input.nextInt();
		System.out.println("Enter the number of columns: ");
		column = input.nextInt();
		matrix = new double[row][column];
		
		// Prompt user to enter the elements of the array
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		// Locate largest element
		Location location = new Location();
		System.out.println("The location of the largest element is: " + location.maxValue);
	}

}
