package nasir.unit1;

import java.util.Scanner;

/**
 * ObjectHeight.Java This program will calculate the height of an object based
 * on specific time September 24,2019
 * 
 * @author Muhammad Nasir
 *
 */
public class ObjectHeight {
	/**
	 * Entry point to the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		double time;
		double height;

		System.out.println("PLease enter a time less than 4.5 seconds: ");
		time = c.nextDouble();

		if (time > 4.5 || time < 0) {
			do {
				System.out.println("Please eneter valid input ");
				time = c.nextDouble();
			} while (time > 4.5 || time < 0);
		}

		height = 100 - (2.9 * (time * time));
		System.out.println("The height of the object is: " + height + "meters");

		/*
		 * This is the end of the code.
		 */

	}
}
