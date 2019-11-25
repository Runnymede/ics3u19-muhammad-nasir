package nasir.unit2;

/**
 * This program informs the user if the car whose model number they entered needs repairs or not.The program closes if an invalid car model is entered.
 * @author Muhammad Nasir
 * October 28,2019
 */
import java.util.Scanner;

public class CarRecall2 {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		//Entry point of the code
		// Variable declared
		int carModel;

		do {
			// The following two statements get the users input.
			System.out.println("Please enter the model number: ");
			carModel = c.nextInt();
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
			case 0:
				System.out.println("Invalid car model.");
				break;

			default:
				System.out.println("Your car is not defective.Therefore,doesn't need to be repaired.");
			}

			// The following while closes the program if someone enters a invalid car
			// model,which in this case is 0.
		} while (carModel != 0);
		System.out.println("Closing Program");

	}
}
