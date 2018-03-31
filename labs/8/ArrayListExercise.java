import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create array list
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Prompt user to enter five numbers and add them to list
		System.out.println("Enter five numbers: ");
		for (int i = 0; i < 5; i++) {
			numbers.add(input.nextInt());
		}
		
		// Sort the numbers
		sort(numbers);
		
		// Display sorted list
		System.out.println(numbers.toString());

	}

	// Method to sort an Array List of integers
	private static void sort(ArrayList<Integer> numbers) {
		java.util.Collections.sort(numbers);	
	}

}
