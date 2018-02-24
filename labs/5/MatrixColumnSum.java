import java.util.Scanner;

public class MatrixColumnSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create array for matrix 
		double[][] matrix = new double[3][4];
		
		// Prompt users to enter a 3 by 4 matrix
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		
		// Adds the elements of each column
		for (int column = 0; column < matrix[0].length; column++) {
			double total = 0;
			for (int row = 0; row < matrix.length; row++) {
				total += matrix[row][column];
			}
			System.out.println("Sum of the elements at column " + column + " is " + total);
		}

	}

}
