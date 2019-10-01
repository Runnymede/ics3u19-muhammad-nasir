package nasir.unit1;

import java.util.Scanner;
/**
 * THis program calculates the amount of hundreds,tens and ones in a 3-digit number.
 * @author Muhammad nasir
 * Oct 1st,2019
 */
public class DigitsProgram {
	/**
	 * 	Entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		int number;
		int hundreds;
		
		
		Scanner c= new Scanner(System.in);	

		
		System.out.println("Please enter a 3-digit number");
		number=c.nextInt();
		System.out.println("Your number is " + number);
		
		hundreds= number/100;
		
		int tens= (number%100)/10;
		int ones= (number%10);
		
	System.out.println("Hundreds: " + hundreds);
	System.out.println("Tens: " + tens);
	System.out.println("Ones: " + ones);
	

/*
 * This is the end of the code
 */

		
	
	}

}
