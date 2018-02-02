import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a letter
			System.out.print("Enter a letter: ");
			String letter = input.nextLine();
			char ch = letter.charAt(0);

			if (Character.isLetter(ch)) {
				switch(Character.toUpperCase(ch)) {
					case 'A': System.out.println(ch + " is a vowel"); break;
					case 'E': System.out.println(ch + " is a vowel"); break;
					case 'I': System.out.println(ch + " is a vowel"); break;
					case 'O': System.out.println(ch + " is a vowel"); break;
					case 'U': System.out.println(ch + " is a vowel"); break;
					default : System.out.println(ch + " is a consonant"); 
				}
			}
			else
				System.out.println(ch + " is an invalid input");
	}
}
