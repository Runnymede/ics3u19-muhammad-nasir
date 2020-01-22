package nasir.finalculminating;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import hsa_new.Console;

/**
 * The following program is a rock paper scissors game between the computer and
 * the user. The computer picks an object based on random numbers,the user picks
 * the object they desire. A winner is decided based on the rules and the first
 * to win two rounds wins the game.
 * 
 * @author Muhammad Nasir
 * January 21, 2020
 */

//Starting point of the program.
public class FinalCulminatingGame {
	//New console generated.
	static Console c = new Console(24, "Rock Paper Scissors Game");
//Global variables declared
	public static int userScore = 0;
	public static int compScore = 0;

	
	public static void main(String[] args) throws InterruptedException {//Main method.
//Image imported and displayed on console.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image openingScreen = toolkit.getImage("src/nasir/finalCulminating/openingscreen.png");
		c.drawImage(openingScreen, -40, -40, 1290, 955, null);
		//8 second pause after which the screen is cleared.
		Thread.sleep(8000);
		c.clear();
//Variable declared.
		String userInput;
		//The following do-while loop replays the program if the user wishes to play again.
		do {
//The play method is called upon.
			play();
//The following if statement is used to congratulate the winner of the entire game.
			if (userScore > compScore) {
				c.println("\nCongratulations you have won!!!");
			} else {
				c.println("The computer has won. Please try again ;)");
			}
			// 3 second pause after which the console is cleared. 
			Thread.sleep(3000);
			c.clear();
			//The following two lines ask the user if they want to play again and gets their input.
			c.println("Do you want to play again? (Y/N)");
			userInput = c.readString();
//Global variables initialized at 0.
			FinalCulminatingGame.compScore = 0;
			FinalCulminatingGame.userScore = 0;

		} while (!userInput.equalsIgnoreCase("N") || !userInput.equalsIgnoreCase("n"));
		c.close();
	}

	
	/**
	 * This method runs the significant parts and majority of the program.
	 * @throws InterruptedException
	 */

	public static void play() throws InterruptedException {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image rock = toolkit.getImage("src/nasir/finalCulminating/rock.png");
		Image rockMirrored = toolkit.getImage("src/nasir/finalCulminating/rock2.png");
		Image paper = toolkit.getImage("src/nasir/finalCulminating/paper.png ");
		Image paperMirrored = toolkit.getImage("src/nasir/finalCulminating/paper2.png");
		Image scissors = toolkit.getImage("src/nasir/finalCulminating/scissors.png");
		Image scissorsMirrored = toolkit.getImage("src/nasir/finalCulminating/scissors2.png");
		
		// Variable Declaration
int userInput;
		int compInput;
		int round = 1;

		// Array Declaration
		String objects[] = { "Rock", "Paper", "Scissor" };
//The following do-while loop goes through the rounds until one of the players gets to two points.
		do {
			//user is welcomed to each round.
			c.println("Welcome to Round " + round);
			round++;
//A random number is generated and stored in the variable "compInput"
			Random rand = new Random();
			compInput = rand.nextInt(3);
			compInput++;

			// In the following two lines the users is asked for their choice and the input is taken.
			c.println("Enter the corresponding number to the specified choice:\n1.Rock\n2.Paper\n3.Scissor");
			userInput = c.readInt();
			// Console screen is reset.
			c.clear();
			
			// User images print conditions
			if (userInput == 1) {
				c.drawImage(rock, 730, 210, 420, 420, null);
			} else if (userInput == 2) {
				c.drawImage(paper, 730, 210, 420, 420, null);
			} else if (userInput == 3) {
				c.drawImage(scissorsMirrored, 730, 210, 420, 420, null);
			}

			// Computer image print conditions
			if (compInput == 1) {
				c.drawImage(rockMirrored, 1, 200, 420, 420, null);
			} else if (compInput == 2) {
				c.drawImage(paperMirrored, 1, 205, 420, 420, null);

			} else if (compInput == 3) {
				c.drawImage(scissors, 1, 205, 420, 420, null);
			}
//3 second pause after which the console screen is reset.
			Thread.sleep(3000);
			c.clear();
//The following line prints what object each player has picked.
			c.println("The user entered " + objects[userInput - 1] + " and the computer entered "
					+ objects[compInput - 1]);
//This if statement uses the winner method to congratulate the winner of each round and display the score at the end of each round.
			if (winner(userInput, compInput) == 1) {
				c.println("User has won the round!\n\n");
				FinalCulminatingGame.userScore++;
				c.println("The scores are as follows:\nUser Score: " + userScore + "\nComputer Score: " + compScore
						+ "\n");
			} else if (winner(userInput, compInput) == 0) {
				c.println("Computer has won the round!\n\n");
				FinalCulminatingGame.compScore++;
				c.println("The scores are as follows:\nUser Score: " + userScore + "\nComputer Score: " + compScore
						+ "\n");
			} else {
				c.println("This round is a draw\n\n");
				c.println("The scores are as follows:\nUser Score: " + userScore + "\nComputer Score: " + compScore
						+ "\n");
			}

		} while (FinalCulminatingGame.compScore != 2 && FinalCulminatingGame.userScore != 2);
	}

	/**
	 * This method determines the winner.
	 * @param user- users input corresponding to the object they picked.
	 * @param comp- computers input corresponding to its object.
	 * @return- A number is returned based on the winner,which is then used in the play method to print statements accordingly.
	 */
	public static int winner(int user, int comp) {
		int userWin = 1;

		if (user == 1 && comp == 3) {
			return userWin;
		} else if (user == 2 && comp == 1) {
			return userWin;
		} else if (user == 3 && comp == 2) {
			return userWin;
		} else if (comp == 1 && user == 3) {
			userWin = 0;
			return userWin;
		} else if (comp == 2 && user == 1) {
			userWin = 0;
			return userWin;
		} else if (comp == 3 && user == 2) {
			userWin = 0;
			return userWin;
		} else {
			userWin = -1;
			return userWin;
		}
	}

}//End.