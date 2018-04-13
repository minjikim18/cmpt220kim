import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveText {

	public static void main(String[] args) throws FileNotFoundException {
		// Create new file object that takes in argument 1/second argument
		File file = new File(args[1]);
		
		// Scanner that reads the file
		Scanner input = new Scanner(file);
		
		// Check if file contains the given word and then remove them all
		while (input.hasNextLine()) {
			String word = args[0];
			String entireLine = input.nextLine();
			
			if (entireLine.contains(word)) {
				String newLine = entireLine.replaceAll(word, "");
				System.out.println(newLine);
			}
			
		}
		// JA: You had to write it back to the file
		
		
	}

}
