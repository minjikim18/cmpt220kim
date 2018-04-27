import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter an integer 
		System.out.print("Enter an integer: ");
		long integer = input.nextLong();
		int sum = 0;
		
		// Display the result
		System.out.print("Sum of the digits in the integer you entered: " + sumDigits(integer, sum));
		
	}

	// Recursion method to find the sum of the digits of the given integer
	private static int sumDigits(long integer, int sum) {
		if (integer == 0) 
			return sum;
		else
			return sumDigits(integer / 10, sum + (int)(integer % 10));
	}
}
