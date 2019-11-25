package nasir.unit2;

import java.util.Scanner;

/**
 * This program takes a positive integer from the user,then calculates and
 * displays the sum of the digits. For example: The user enters the integer
 * 22334. The program will add each digit and display the output as: Sum of
 * digits = 14.
 * 
 * @author Muhammad Nasir October 31,2019
 */

public class DigitsSum {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		// Entry point of the code
		// Gets a positive integer and stores it in the variable "userInput".
		System.out.println("Please enter a positive integer: ");
		int userInput = c.nextInt();

		// The following while statement asks the user for a valid input if they entered
		// a negative integer, until they enter a positive integer.
		while (userInput < 0) {
			System.out.println("Invalid input. Please enter a valid input: ");
			userInput = c.nextInt();
		}
		// variable declared
		int sum = 0;

		// This loop helps separate all the digits and add them up as a sum.
		while (userInput != 0) {
			sum = sum + userInput % 10;
			userInput = userInput / 10;
		}
		System.out.println("The sum of the digits is: " + sum);

	}
}
//End of code.