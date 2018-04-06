import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
	public static void main(String[] args) throws FileNotFoundException {
		
		// Create a new file that takes in the first argument
		File file = new File(args[0]);

		// Input will be read from the file
		Scanner input = new Scanner(file);
		
		// Character, Word, Line data fields
		int character = 0;
		int word = 0;
		int line = 0;
		
		// Check to see how many lines, words, and character the file contains
		while (input.hasNextLine()) {
			line++;
			String entireLine = input.nextLine();
			character += entireLine.length();
			String[] words = entireLine.split(" ");
			word += words.length;
		}
		
		// Display number of lines, words, and character
		System.out.println("File " + args[0] + " has: " );
		System.out.println(character + " characters");
		System.out.println(word + " words");
		System.out.println(line + " lines");
	}
}