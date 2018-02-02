import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		// Random number generator 0-2
		 Random rn = new Random();
		 int computer = rn.nextInt(3);
		
		// Prompts user to enter a number 0-2
		 System.out.println("Pick Scissor(0), Rock(1), Paper(2) ");
		 int player = input.nextInt();
		 
		 // Outputs what the computer is
		 System.out.println(computer);
		 
		 // if statement to show if user or computer won
		 if (player == 0 && computer == 2)
			 System.out.println("Computer is paper. You are scissor. You won.");
		 if (player == 0 && computer == 1)
			 System.out.println("Computer is rock. You are scissor. You lose.");
		 if (player == 0 && computer == 0)
			 System.out.println("Computer is scissor. You are scissor. Tie!");
		 
		 if (player == 1 && computer == 0)
			 System.out.println("Computer is scissor. You are rock. You won.");
		 if (player == 1 && computer == 2)
			 System.out.println("Computer is paper. You are rock. You lose.");
		 if (player == 1 && computer == 1)
			 System.out.println("Computer is rock. You are rock. Tie!");
		 
		 if (player == 2 && computer == 1)
			 System.out.println("Computer is rock. You are paper. You won.");
		 if (player == 2 && computer == 0)
			 System.out.println("Computer is scissor. You are paper. You lose.");
		 if (player == 2 && computer == 2)
			 System.out.println("Computer is paper. You are paper. Tie!");
		 
	}
}


