import java.util.Scanner;

public class OccurenceOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter integers between 1 and 100
		System.out.print("Enter the integers between 1 and 100: (Enter 0 to end) ");
		
		// Create array and popuate area
		int[] numberCount = new int[100];
		int n = input.nextInt();
		
		// Increment count if number isnt 0
		while ( n != 0 ) {
				numberCount[n-1]++;
				n = input.nextInt();
		}
		
		// Print occurence of numbers
		for (int i = 0; i < 100; i++) {
			if (numberCount[i] > 0) {
				System.out.println((i+1) + " occurs " + numberCount[i] + 
						(numberCount[i] == 1? " time" : " times"));
			}
		}
	}
}
	

