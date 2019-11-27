
package nasir.unit3;

import java.util.Scanner;

public class TicTacToe {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
int row,col;
boolean playing = true;
//
char[][] tttBoard = new char[3][3];
		char turn ='x';
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
	
	

while(playing) {
	
}
}
}
