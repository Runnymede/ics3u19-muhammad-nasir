package nasir.unit2;

import java.util.Scanner;

/**
 * This is a number guessing game.
 * 
 * @author Muhammad Nasir 
 * october 23,2019
 */
public class GuessingGame {

	public static void main(String[] args) {

		int secretnumber;
		int usernumber;



		Scanner c = new Scanner(System.in);



		do {
			// The following line of code draws a random number for the game
			secretnumber = (int) (Math.random() * 20 + 1);

			// Asks the user to input the number of choice choice
			System.out.println("Please eneter a number between 1 and 20: ");

			//The following block stores the users number in the variable "usernumber" and displays the secret number and the users number.
			 usernumber = c.nextInt();
			System.out.println("Secret Number: " + secretnumber);
			System.out.println("Player's Number: " + usernumber);

			//Compares the two numbers
			if (secretnumber == usernumber) {
				System.out.println("You Won!");
			} 
		
		}	while(usernumber!= secretnumber);
			System.out.println("Please try again");
	}
}
		
		
