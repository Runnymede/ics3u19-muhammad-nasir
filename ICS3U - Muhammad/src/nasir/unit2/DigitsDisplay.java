package nasir.unit2;

import java.util.Scanner;

/**
 * This program will take a positive integer from the user and display each
 * digit on a separate line. Example: "please enter a positive integer:" *User
 * enters 5346* Output: 5 3 4 6
 * 
 * @author Muhammad Nasir October 30,2019
 */

public class DigitsDisplay {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		//Entry point of the program.
		// The following 2 lines ask the user to enter a positive integer. Declares the
		// variable "integer" as an int and stores the users answer in the variable
		// "integer"
		System.out.println("Please enter a positive integer: ");
		int integer = c.nextInt();

		// The following while loop asks the user for a valid input if they enter a
		// negative number.
		while (integer < 0) {

			System.out.println("Invalid input, please enter a positive number");
			integer = c.nextInt();
		}
		// variables declared.
		int output, reversed = 0;

		// This while loop separates the digits and reverses them,making sure they print
		// from left to right.
		while (integer != 0) {
			int digit = integer % 10;
			reversed = reversed * 10 + digit;
			integer /= 10;
		}
		// The following block of code separates the reversed digits and prints them.
		while (reversed > 0) {
			output = (reversed % 10);
			reversed = reversed / 10;
			System.out.println(output);
		}
	}

}
