import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create array
		double[] numbers = new double[10];
		
		// Prompt user to enter ten numbers and populate array
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		// Print out what the smallest number is
		System.out.print("The smallest number is " + min(numbers));

	}

	// Method to find the smallest number
	private static double min(double[] numbers) {
		double min = numbers[0];
		for (double i: numbers) {
			if (i < min)
				min = i;
		}
		return min;
	}

}
