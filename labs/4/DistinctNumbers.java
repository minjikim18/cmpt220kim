import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		
		// Create array
		int[] number = new int[10];
		int count = 0;
		
		// Populate array and check if array is distinct
		for (int i = 0; i < 10; i++) {
			int n = input.nextInt();
			if (isDistinct(number, n)) {
				number[count] = n;
				count++;
			}
		}
		
		// Print out number of distinct numbers 
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0)
				System.out.print(" " + number[i]);
		}
		System.out.println();
	}

	// Method to check is number is distinct
	private static boolean isDistinct(int[] number, int n) {
		for (int i = 0; i < number.length; i++) {
			if (n == number[i]) 
				return false;
		}
		return true;
	}
}


