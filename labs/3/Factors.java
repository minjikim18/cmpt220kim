import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to find the factors: ");
		int number = input.nextInt(); 
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.printf("%7d",i);
		}
	}

}
