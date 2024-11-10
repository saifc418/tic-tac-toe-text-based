//package tictactoe;

import java.util.Scanner;

public class TicTacToe {

	// Initialize and declare variables
	private static final int SIZE = 3; // Size for the TicTacToe board
	private char[][] board = new char[SIZE][SIZE]; // Character array for the TicTacToe board
	private char currentPlayer; // Character variable for current player (X or O)

	// Constructor to initialize the board and the first player
	public TicTacToe() {

		// Loop for the number of rows (3)
		for (int i = 0; i < SIZE; i++) {

			// Loop for the number of columns (3)
			for (int j = 0; j < SIZE; j++) {

				// Add the char '-' for every spot in the array
				board[i][j] = '-';
			}
		}

		// Initialize currentPlayer to player 1 (X)
		currentPlayer = 'X';
	}

	// Display the current state of the board
	public void displayBoard() {

		// Loop for the length of the board (3)
		for (int i = 0; i < board.length; i++) {

			// Loop for the length of the board (3)
			for (int j = 0; j < board.length; j++) {

				// Display the character at the position in the array, followed by a space
				System.out.print(board[i][j] + " ");
			}

			// Print a new line
			System.out.println();
		}
	}

	// Make a move at the specified location
	public boolean makeMove(int row, int col) {

		// If the position in the array has a valid move,
		// a '-' and not a 'X' or 'O', run this block
		if (board[row][col] == '-') {

			// Return true. Move is valid.
			return true;
		}

		// If the if statement does not run, run this
		else {

			// Return false. Move in invalid.
			return false;
		}
	}

	// Check if there is a winner
	public boolean checkWinner() {

		// Initialize return counter to 0
		int returnCounter = 0;

		// Checks first row
		if (board[0][0] == 'X') {

			if (board[0][1] == 'X') {

				if (board[0][2] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks second row
		if (board[1][0] == 'X') {

			if (board[1][1] == 'X') {

				if (board[1][2] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks third row
		if (board[2][0] == 'X') {

			if (board[2][1] == 'X') {

				if (board[2][2] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks first row
		if (board[0][0] == 'O') {

			if (board[0][1] == 'O') {

				if (board[0][2] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks second row
		if (board[1][0] == 'O') {

			if (board[1][1] == 'O') {

				if (board[1][2] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks third row
		if (board[2][0] == 'O') {

			if (board[2][1] == 'O') {

				if (board[2][2] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks first column
		if (board[0][0] == 'X') {

			if (board[1][0] == 'X') {

				if (board[2][0] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks second column
		if (board[0][1] == 'X') {

			if (board[1][1] == 'X') {

				if (board[2][1] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks third column
		if (board[0][2] == 'X') {

			if (board[1][2] == 'X') {

				if (board[2][2] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks first column
		if (board[0][0] == 'O') {

			if (board[1][0] == 'O') {

				if (board[2][0] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks second column
		if (board[0][1] == 'O') {

			if (board[1][1] == 'O') {

				if (board[2][1] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks third column
		if (board[0][2] == 'O') {

			if (board[1][2] == 'O') {

				if (board[2][2] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks diagonal from top left to bottom right
		if (board[0][0] == 'X') {

			if (board[1][1] == 'X') {

				if (board[2][2] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks diagonal from top left to bottom right
		if (board[0][0] == 'O') {

			if (board[1][1] == 'O') {

				if (board[2][2] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// Checks diagonal from top right to bottom left
		if (board[0][2] == 'X') {

			if (board[1][1] == 'X') {

				if (board[2][0] == 'X') {

					returnCounter = 1;
				}
			}
		}

		// Checks diagonal from top right to bottom left
		if (board[0][2] == 'O') {

			if (board[1][1] == 'O') {

				if (board[2][0] == 'O') {

					returnCounter = 1;
				}
			}
		}

		// If returnCounter is 0, there is no winner. Run this block
		if (returnCounter == 0) {

			// Return false. No winner
			return false;
		}

		// If the if block does not run, run this block
		else {

			// Return true. There is a winner.
			return true;
		}
	}

	// Check if the board is full (i.e., the game is a draw)
	public boolean isBoardFull() {

		// Initialize count to 0
		int count = 0;

		// Loop for the number of rows in the board array (3)
		for (int i = 0; i < SIZE; i++) {

			// Loop for the number of columns in the board array (3)
			for (int j = 0; j < SIZE; j++) {

				// If there is a char '-' in the board array, run this block
				if (board[i][j] == '-') {

					// Add 1 to count
					count += 1;
				}
			}
		}

		// If count is 0, run this block. The board is full
		if (count == 0) {

			// Return true. The board is full
			return true;
		}

		// If the if statement does not run, run this block
		else {

			// Return false. The board is not full
			return false;
		}
	}

	// Switch players after each move
	public void switchPlayer() {

		// If currentPlayer is 'X', assign it to 'O'
		// Otherwise, assign currentPlayer to 'X'
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

	}

	// Run main method
	public static void main(String[] args) {

		// Initialize scanner object for user input from console
		Scanner scanner = new Scanner(System.in);

		// Initialize TicTacToe game object
		TicTacToe game = new TicTacToe();

		// Initialize gameWon boolean variable as false
		boolean gameWon = false;

		// Declare variables
		String userInput; // userInput for rows and columns
		int row; // row the user inputs for position on board
		int column; // column the user inputs for position on board

		// Declare makeMove variable to determine if a move is valid or not
		boolean makeMove;

		// Welcome the user
		System.out.println("Welcome to Tic-Tac-Toe!\n");

		// Loop while the game has not been won and the board is not full
		while (!gameWon && !game.isBoardFull()) {

			// If the currentPlayer is 'X' (Player 1), run this block
			if (game.currentPlayer == 'X') {

				// Tell Player 1 to make their move
				System.out.print("Player 1 (X), enter your move (row and column): ");
			}

			// If currentPlayer is 'O' (Player 2), run this block
			else {

				// Tell Player 2 to make their move
				System.out.print("Player 2 (O), enter your move (row and column): ");
			}

			// Get the user's input for position on board. Example: 0 1
			userInput = scanner.nextLine();

			// Initialize scanner object to later access the row and column
			// as their own variables from userInput
			Scanner userInputScanner = new Scanner(userInput);

			// Read the row on the board from userInput
			row = userInputScanner.nextInt();

			// Read the column on the board from userInput
			column = userInputScanner.nextInt();

			// Read makeMove (Checks if the move is valid or not)
			makeMove = game.makeMove(row, column);

			// Loop while makeMove is false
			while (makeMove == false) {

				// Inform user their move is invalid and to enter it again
				System.out.print("Invalid move. Please enter move again (row and column): ");

				// Read the users move
				userInput = scanner.nextLine();

				// Initialize scanner object to later access the row and column
				// as their own variables from userInput again
				userInputScanner = new Scanner(userInput);

				// Read the row on the board from userInput
				row = userInputScanner.nextInt();

				// Read the column on the board from userInput
				column = userInputScanner.nextInt();

				// Read makeMove (Checks if the move is valid or not)
				makeMove = game.makeMove(row, column);
			}

			// Update the board with 'X' or 'O' on the correct
			// position on the board
			game.board[row][column] = game.currentPlayer;

			// Display the board
			game.displayBoard();

			// Print a new line
			System.out.println();

			// If there is a winner, run this block
			if (game.checkWinner() == true) {

				// Set gameWon to true
				gameWon = true;

				// If the current player is Player 1 (X), run this block
				if (game.currentPlayer == 'X') {

					// Inform the user the game is over and who won
					System.out.println("Game over! Player 1 has won!");
				}

				// If the current player is Player 2 (O), run this block
				else {

					// Inform the user the game is over and who won
					System.out.println("Game over! Player 2 has won!");
				}
			}

			// Switch the player to either 'X' or 'O'
			game.switchPlayer();

			// Close the userInputScanner object
			userInputScanner.close();
		}

		// If the board is full and there is no winner, run this block
		if (game.isBoardFull() == true && gameWon == false) {

			// Inform the user that the game is over and that it is a draw (no winner)
			System.out.println("Game over! It is a draw!");
		}

		// Close the scanner object
		scanner.close();
	}
}