import java.lang.reflect.Array;
import java.util.Scanner;

public class LargstNumberInArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		// Create space for array and prompt user to enter eight integers
		int[] numbers = new int[8];
		System.out.print("Enter a list of eight integers: ");
		for (int i = 0; i < 8; i++) 
			numbers[i] = input.nextInt();
		
		// Display the largest integer in the list
		System.out.print("The largest integer in the list is " + largestIntger(numbers));
	}

	// Recursion to find largest Integer
	private static int largestIntger(int[] numbers) {
		return largestInteger(numbers, 0, numbers[0]);
	}
	
	// Recursion helper method
	private static int largestInteger(int[] numbers, int i, int j) {
		if (i == numbers.length)
			return j;
		else if (j < numbers[i])
			j = numbers[i];
		
		return largestInteger(numbers, i + 1, j);
	}
}

