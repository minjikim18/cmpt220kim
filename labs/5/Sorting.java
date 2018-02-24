import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter size of the list and input that as array size
		System.out.print("Enter the size of the list ");
		int s = input.nextInt();
		int[] array = new int[s];
		
		// Prompt user to enter the contents of the list
		System.out.println("Enter the contents of the list ");
		for (int i = 0; i < s; i++) {
			array[i] = input.nextInt();
		}
		
		// Display how many integers list has
		System.out.println("The list has " + s + " integers " + Arrays.toString(array));
		
		// Check if the list is sorted or not
		if (isSorted(array) == true)
			System.out.print("The list is already sorted");
		else
			System.out.println("The list is not sorted");

	}

	// Method to check if list is sorted or not
	private static boolean isSorted(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[i+1]) {
				return true;
			} else
				return false;
		}
		return false;
	}

}
