
public class TicTacToe {
	public static void main(String[] args) {
		// Creates a new TicTacToe Object
		GameBoard newGame = new GameBoard();
		
		// Start game and prints the game board
		System.out.println("Lets start a game of TicTacToe!!");	
		newGame.displayBoard();
		
		// While game is still playing and board is not full, loop will ask players to input position
		int count = 1;
		while (newGame.gameActive() && count < 10) {
			if (count % 2 == 0)
				newGame.askPlayer('O');
			else
				newGame.askPlayer('X');
			count++;
			
			System.out.println();
			newGame.displayBoard();
			System.out.println();
			
			// Check for winner
			newGame.checkWinner();
						
			// If 9 moves are made, game baord is full and game will be tied
			if (count == 10) {
			System.out.println("Game is a tie!");
			}
		}
	}
}
