import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Variables for positive numbers, negative numbers, count of all numbers, and total
		int positive = 0;
		int negative = 0;
		int count = 0;
		double total = 0;
		
		// Prompt user to enter integers
		System.out.println("Enter an integer, the input ends if it is a 0: ");
		int i = input.nextInt();
		
		// What to print when only 0 is entered
		if (i == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		
		// What to do when integers are entered
		while ( i != 0) {
			if (i > 0)
				positive++; // Positive integer counts
			else
				negative++; // Negative integer counts
			total += i; // Total sum
			count++; // Count of all integers
			i = input.nextInt();
			
		}
		
		// Calculate average
		double average = total / count;
		
		// Print results 
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average
				);
		
	}
}