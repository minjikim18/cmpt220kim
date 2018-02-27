import java.util.Scanner;

public class AddingMatrices {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create three matrices (matrix 1 + matrix 2 = matrix 3
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] matrix3 = addMatrix(matrix1, matrix2);  // JA: If you call it here, it will be empty
		
		
		// Prompt user to enter matrx 1
		System.out.print("Enter matrix1 (3x3): ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		// Prompt user to enter matrix 2 
		System.out.print("Enter matrix2 (3x3): ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		printFormat(matrix1, matrix2, matrix3);
	}

	//  Method to print the matrices in the format 
	private static void printFormat(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
		System.out.println("The matrices are added as follows");
		
		for (int i = 0; i < 3; i++) {
			print(matrix1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(matrix2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(matrix3, i);
			System.out.println();
		}
		
	}

	// Method to individually print matrices
	private static void print(double[][] matrix1, int i) {
		for (int j = 0; j < matrix1[i].length; j++) {
			System.out.print(matrix1[i][j] + " ");
		}		
	}

	// Method to add matrices
	private static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
		double[][]matrix3 = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrix3; 
	}
}
