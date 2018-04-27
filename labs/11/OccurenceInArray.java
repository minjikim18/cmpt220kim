import java.util.Scanner;

public class OccurenceInArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a list of charcters in a line
		System.out.println("Enter a list of characters in one line: ");
		String characters = input.nextLine();
		
		// Prompt user to enter a charcater
		System.out.println("Enter a character: ");
		char character = input.next().charAt(0);

		// Display occurence of the character in the string
		char[] chars = characters.replaceAll(" ", "").toCharArray();
		System.out.println("The occurrences of " + character + " in " + characters + " is "
		+ count(chars, character));
	}

	// Recursion method to find occurence of character in a string
	private static int count(char[] chars, char character) {
		return count(chars, character, chars.length - 1);
	}
	
	private static int count(char[] chars, char character, int high) {
		int count = (chars[high] == character) ? 1 : 0;
		if (high == 0)
			return count;
		else
			return count + count(chars, character, high - 1);
	}

}
