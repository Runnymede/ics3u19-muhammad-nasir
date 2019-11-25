package nasir.unit2;

import java.util.Scanner;

/**
 * The following program calculates the probability of the amount of 4 digit
 * numbers whose answers will be 34 or higher.
 * 
 * @author 344979026
 *
 */
public class LicenseTotal {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		// Entry point of the program
		// Variables declared
		double count = 0;
		double sum = 0;
		// The following for loop goes through the numbers 3000 to 9999
		for (int num = 3000; num <= 9999; num++) {
			// The following block of code separates the digits of the number
			double digit1 = (num % 10);
			double digit2 = (num % 100) / 10;
			double digit3 = (num % 1000) / 100;
			double digit4 = (num / 1000);
			// The next line gets the sum of the separated digits
			sum = digit1 + digit2 + digit3 + digit4;
			// Adds one to the counter every time the sum of a numbers digits is equal to or
			// more than 34
			if (sum >= 34) {
				count++;

			}

		}
		// Prints out the percentage.
		System.out.println("The percentage of the number that satisfy's the question is %" + (count / 10000) * 100);

	}

}
//End of code