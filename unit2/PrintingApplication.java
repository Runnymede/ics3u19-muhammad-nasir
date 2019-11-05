package nasir.unit2;


import java.text.NumberFormat;
import java.util.Scanner;
/**
 * This program calculates the total cost depending on the amount of copies the user requires.
 * @author Muhammad Nasir	
 * October 4,2019
 *
 */
public class PrintingApplication {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		NumberFormat price2= NumberFormat.getCurrencyInstance();
		// These two lines get the input from the user.
		System.out.println("Please enter the amount of copies you want: ");
		int copies = c.nextInt();

		// These five lines take the users input and multiply it by the assigned prices.
		double totalcost = 0;
		double price;
		// The following blocks output the cost per copy and total cost for the amount of
		// copies the user wants.
		if (copies < 100) {
			price= 0.30;
		} else if (copies > 99 && copies < 500) {
			price= 0.29;
		} else if (copies > 499 && copies < 750) {
			price= 0.28;
		} else if (copies > 749 && copies <= 1000) {
			price=0.26;
		}

		else {
			price = 0.26;
		}
		
		System.out.println("Price per copy is " + price);
		System.out.println("Total Cost: " + price2.format(totalcost));

	}

}
