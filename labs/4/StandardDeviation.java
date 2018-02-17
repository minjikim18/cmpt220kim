import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		// Create array
		double[] numbers = new double[10]; 

		// Prompt user to enter ten numbers and populate array
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++)
			numbers[i] = input.nextDouble();

		// Print out mean and standard deviation
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}

	// Method to find standard deviation
	public static double deviation(double[] numbers) {
		double deviation = 0;
		double mean = mean(numbers);
		for (double j: numbers) {
			deviation += Math.pow(j - mean, 2);
		}
		return Math.sqrt(deviation / (10 - 1));
	}

	// Method to find mean
	public static double mean(double[] numbers) {
		double mean = 0;
		for (double j: numbers) {
			mean += j;
		}
		return mean / 10;
	}
}