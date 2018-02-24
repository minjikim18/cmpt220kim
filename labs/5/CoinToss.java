import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Create matrix of 3 by 3
		int[][] matrix = new int[3][3];
		
		// Prompt the user to enter a number between 0 to 511
		System.out.print("Enter a number between 0 - 511: ");
		int number = input.nextInt();
		String binaryNumber = toBinary(number);
		
		// 0's and 1's will be added on based on binary string
		int binaryIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int headsOrTails = (binaryNumber.charAt(binaryIndex++) == '0') ? 0 : 1;
                matrix[i][j] = headsOrTails;
			}
		}
		 for (int i = 0; i < matrix.length; i++) {

	            for (int j = 0; j < matrix[i].length; j++) {
	                char ch = (matrix[i][j] == 0) ? 'H' : 'T';
	                System.out.print(ch + " ");
	            }
	            System.out.println("");
	        }

	}

	// Method to
	private static String toBinary(int number) {
		 StringBuilder string = new StringBuilder();
		while (number != 0) {
	            string.append(number & 1);
	            number = number >> 1;
	        }
	        while (string.length() < 9) {
	            string.insert(0, "0");
	        }
	        return string.toString();
	}

}
