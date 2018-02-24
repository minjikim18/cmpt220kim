import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create an array to store ten numbers
		int[] array = new int[10];
		
		// Prompt user to enter 10 numbers
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextInt();
		}
		
		// Create another array for after duplicates are removed
		int[] distinctNumbers = eliminateDuplicates(array);
		
		// Display the result
		System.out.print("The distinct numbers are:");
		for (int i: distinctNumbers) {
			if (i > 0)
				System.out.print(" " + i);
		}
		System.out.println();
	}

	// Method to eliminate duplicates
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];
		int i = 0;	
		for (int j : list) {
			if (linearSearch(distinctList, j) == -1) {
				distinctList[i] = j;
				i++;
			}
		}
		return distinctList;
	}

	// Method for linear search while eliminating duplicates
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}