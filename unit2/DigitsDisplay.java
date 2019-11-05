package nasir.unit2;

import java.util.Scanner;

/**
 * This program will take a positive integer from the user and display each digit on a separate line.
 * Example: "please enter a positive integer:"
 * 
 * @author Muhammad Nasir October 30,2019
 */

public class DigitsDisplay {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		

		System.out.println("Please enter a positive integer: ");
		int integer = c.nextInt();
		
		while (integer < 0) {

			System.out.println("Invalid input, please enter a positive number");
			integer = c.nextInt();
		}
		int output, reversed = 0;
		while (integer != 0) {
			int digit = integer % 10;
			reversed = reversed * 10 + digit;
			integer /= 10;
		}
		while (reversed > 0) {
			output = (reversed % 10);
			reversed = reversed / 10;
			System.out.println(output);
		}
	}

}
