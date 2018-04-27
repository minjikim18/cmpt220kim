import java.util.Scanner;

public class OccurenceOfString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a string and store it
		System.out.print("Enter a String: ");
		String word = input.next();
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		System.out.println("The occurence of character " + character + " is " + count(word, character));

	}

	// Recursion method to find occurence of a character
	private static int count(String word, char character) {
		 return count(word, character, word.length() - 1);
	}

	// Recursion helper method
	private static int count(String word, char character, int i) {
		int n = (character == word.charAt(0)) ? 1 : 0;
		if (i <= 0)
			return n;
		else
			return n + count(word.substring(1), character, i - 1);
	}

}


