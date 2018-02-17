import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to find the factors: ");
		int number = input.nextInt(); 
		
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) { // JA
				System.out.printf("%7d",i);
				number /= i; // JA
			}
		}
	}

}
