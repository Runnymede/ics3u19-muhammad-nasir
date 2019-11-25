package nasir.unit2;

import java.util.Scanner;

/**
 * This program will inform the users if their car is defective and needs
 * repairs.
 * 
 * @author Muhammad Nasir October 4,2019
 */
public class CarRecall {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		//Entry point of code.
		// The following two statements get the users input.
		System.out.println("Please enter the model number: ");
		int carModel = c.nextInt();

		// The following statements identify and inform the users if their car is
		// defective and needs repairs.
		switch (carModel) {

		case 199:

		case 179:

		case 189:

		case 190:

		case 191:

		case 192:

		case 193:

		case 194:

		case 195:

		case 221:

		case 780:
			System.out.println("Your car is defective.It must be repaired.");
			break;

		default:
			System.out.println("Your car is not defective.Therefore,doesn't need to be repaired.");

		}

	}

}
//This is the end of the code.
