import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a number
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		// Prints matrix
		printMatrix(n);

	}

	// Method to print matrix n x n
	private static void printMatrix(int n) {
		
		for (int rows = 0; rows < n; rows++) {
			for (int columns = 0; columns <n; columns++) {
				System.out.print((int) (Math.random() * 2));
		
			}		
	System.out.println();

		}
	}
}
