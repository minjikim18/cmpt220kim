import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create new object
		StackOfIntegers stack = new StackOfIntegers();
		
		// Prompt user to enter a positive integer
		System.out.println("Enter a positive integer to get all its smallest "
											+ "factors in decreasing order");
		int integer = input.nextInt();
		
		// Display the smallest factors
		System.out.print("The smallest factors of " + input + " are: ");
		Factors(integer, stack);

		while (!stack.isempty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	// Method to find the smallest factors
	private static void Factors(int integer, StackOfIntegers stack) {
		int i = 2; // Potential prime factor
		while (integer / i != 1){ 
			if (integer % i == 0) {
				stack.push(i);
				integer /= i;
			}
			else
				i++;
		}
		stack.push(integer);
	}
}


