import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {

	private char[][] board;
	public boolean activeGame = true;
	
	// Constructor
		public GameBoard() {																	
			board = new char[3][3];												// Creates a 3 x 3 board 

			for (int row = 0; row < board.length; row++) {				// Initializes board with spaces
					Arrays.fill(board[row], ' ');
			}
		}
		
		// This method will print the board
		public void displayBoard() {											   
			for (int row = 0; row < board.length; row++) {
				for (int column = 0; column < board[0].length; column++) {
					System.out.print("\t" + board[row][column]);
					if (column != 2)
						System.out.print("|");										 // Print horizontal Line
				}
				if (row == 1 || row == 0)
					System.out.print("\n---------------------------\n");				   // Print vertical line
			}
			System.out.println();
		}
		
		// This method will check if move is legal and return true if move is complete
		public boolean playerMove(char player, int row, int column) {
			if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
				if (board[row][column] != ' ')									// If the position is  ' ' 
					return false;										   //then position equals to the player
				else {
					board[row][column] = player;				
					return true;
				}
			}
			else 
				return false;
		}
		
		// This method will check if the game is still playing
		public boolean gameActive() {
			return activeGame;
		}
		

		// This method will ask the player to pick row and column
		public void askPlayer(char player) {
			Scanner input = new Scanner(System.in);											// For user input
			int row;
			int column;
			
			do {
				System.out.print("Player " + player + " pick a row: (1-3)");
				row = input.nextInt();
				
				System.out.print("Player " + player + " now pick a column: (1-3)");
				column = input.nextInt();
				
			}	while(inValidMove(row,column)); 								// Will ask again if move is invalid
			
			// Calls the move method for the other player once player makes move
			playerMove(player, row-1, column-1);						// Normal people counts from 1 not 0 so subtract 1
		}

		// This method will check if row & column is between 1 & 3 and also check if position is empty or not
		private boolean inValidMove(int row, int column) {
			if (row > 3 || row < 1 || column > 3 || column < 1 || ! isEmpty(row, column )) {
				return true;
			} else
				return false;
		}

		// This method check if chosen position is avaialbe or not
		private boolean isEmpty(int row, int column) {
			if (board[row-1][column-1] == ' ')
				return true;
			else
				System.out.println("Position is unavailable. Pick another spot!");
				return false;
		}

		// This method checks for winner (3 X's or 3 O's in a row horizontally, vertically, and diagonally)
		public boolean checkWinner() {
			// Check the rows for a winner
			for (int row = 0; row < board.length; row++) {
				 if (board[row][0] == board[row][1] && board[row][1] 
						 		== board[row][2] && board[row][0] != ' ') { 
					 System.out.println("Player " + board[row][0] + " is the winner!");
					 activeGame = false;
				 }
			} 
			
			// Check the columns for a winner
			for (int column = 0; column < board[0].length; column++) {
				if (board[0][column] == board[1][column] && board[1][column]
						== board[2][column] && board[0][column] != ' ') {
					System.out.println("Player " + board[0][column] + " is the winner!");
					activeGame = false;
				}
			}
			
			// Check the diagonals for a winner
			if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
				System.out.println("Player " + board[0][0] + " is the winner!");
				activeGame = false;
			}
				
			if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
				System.out.println("Player " + board[0][2] + " is the winner!");
				activeGame = false;
			}
			 
			return false;	 
		}


}
