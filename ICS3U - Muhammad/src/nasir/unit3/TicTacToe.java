
package nasir.unit3;

import java.util.Scanner;

/**
 * The following is a TicTacToe game.
 * 
 * @author Muhammad Nasir November 26,2019
 */

public class TicTacToe {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		//Entry point of code
		// Variables Declared
	
		int row, col;
		boolean playing = false;
		int count = 0;
		// The following block of code up to the do while statement prints the TicTacToe
		// board for the user to decide where they want to place their letter.
		char[][] tttBoard = new char[3][3];
		char turn = 'X';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tttBoard[i][j] = '_';

			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {

				if (j == 0) {
					System.out.print("| ");
				}

				System.out.print(tttBoard[i][j] + " | ");
			}

		}
		System.out.println();

		// The following block up to the for loops asks the user for the row number and
		// column number(Location of their letter "x" or "O".)
		do {
			playing = true;
			System.out.println("Please enter a row number: ");
			row = sc.nextInt() - 1;
			System.out.println("Please eneter a column number: ");
			col = sc.nextInt() - 1;
			tttBoard[row][col] = turn;
			count++;

			// The following If statement checks for a cheater.
			if (tttBoard[row][col] != 'x' || tttBoard[row][col] != 'o') {
				
			}
			tttBoard[row][col] = turn;
			
			// Prints out the board with the adittion of letters each turn.
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					tttBoard[row][col] = turn;

				}
			}

			for (int i = 0; i < 3; i++) {
				System.out.println();
				for (int j = 0; j < 3; j++) {

					if (j == 0) {
						System.out.print("| ");
					}

					System.out.print(tttBoard[i][j] + " | ");
				}

			}
			System.out.println();

			// The following if statement checks for a draw
			if (count == 9) {
				System.out.println("It's a draw ;)");
				break;
			}

			// -----------------------------------------------------------------------------------------------

			// The following 3 if statements check for a winner in the rows
			if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][1] == tttBoard[0][2] && tttBoard[0][0] == tttBoard[0][2]
					&& tttBoard[0][1] != '_') {
				System.out.println("The Player Playing " + turn + " has won!!!");
				playing = false;

			}
			if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2] && tttBoard[1][0] == tttBoard[1][2]
					&& tttBoard[1][1] != '_') {
				System.out.println("The Player Playing " + turn + " has won!!!");
				playing = false;
			}
			if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][1] == tttBoard[2][2] && tttBoard[2][0] == tttBoard[2][2]
					&& tttBoard[2][1] != '_') {
				System.out.println("The Player Playing " + turn + " has won!!!");
				playing = false;
			}

			// These 3 if statements check for a winner in the columns
			if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][1] == tttBoard[0][2] && tttBoard[0][0] == tttBoard[2][2]
					&& tttBoard[0][2] != '_') {
				System.out.println("The Player Playing " + turn + " has won!!!");
				playing = false;
			}
			if (tttBoard[0][1] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][1] && tttBoard[0][1] == tttBoard[2][1]
					&& tttBoard[1][1] != '_') {
				System.out.println("The Player Playing " + turn + " has won!!!");
				playing = false;
			}
			if (tttBoard[0][2] == tttBoard[1][2] && tttBoard[1][2] == tttBoard[2][2] && tttBoard[0][2] == tttBoard[2][2]
					&& tttBoard[1][2] != '_') {
				System.out.println("The Player Playing " + turn + " has won!!!");
				playing = false;
			}

			// The following 2 if statements check if a player has won diagonally
			if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2] && tttBoard[1][1] != '_') {
				System.out.println("The Player Playing " + turn + " has won diagonally!!!");
				playing = false;
			}
			if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0] && tttBoard[1][1] != '_') {
				System.out.println("The Player Playing " + turn + " has won diagonally!!!");
				playing = false;
			}

			// The following if statement rotates between the turns of player "X" and "O".
			if (turn == 'X') {
				turn = 'O';
			} else
				turn = 'X';

		} while (playing != false);

	}
}
//End of code.