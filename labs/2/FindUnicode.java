import java.util.Scanner;

public class FindUnicode {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Prompt the user to enter a character
		System.out.print("Enter a character: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		
	// Display Unicode of character
		System.out.println((int)ch);
		
		}
	}