package nasir.unit2;
/**
 * This program takes a number from the user and outputs if the number is prime or not.
 *For example: "Please enter a number:"  
 * *User enters 9*
 * output: "9 is not a prime number"
 * or "Please enter a number:"
 * *User enters 13*
 * output: "13 is a prime number"
 * @author Muhammad Nasir
 * November 5,2019
 */
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int input =sc.nextInt();

		//Nested if statement. If the users number is divisible by 2,3,5 or 7 then it wont be a prime number unless the number is 2,3,5 or 7.
		if (input % 2 ==0) {
	
			if (input ==2) {
				System.out.println(input + " is a prime number");
			}
			else {
				System.out.println(input + " is not a prime number");
			}
		}
		else if (input %3 ==0) {
			if (input ==3) {
				System.out.println(input + " is a prime number");
			}
			else {
				System.out.println( input + " is not a prime number");
			}
		}
		else if (input %5 ==0) {
			if (input ==5) {
				System.out.println(input + " is a prime number");
			}
			else {
				System.out.println(input + " is not a prime number");
			}
		}
		else if (input %7 ==0) {
			if (input ==7) {
				System.out.println(input + " is a prime number");
			}
			else {
				System.out.println(input + " is not a prime number");
			}
		}
		else {
			System.out.println(input + " is a prime number");
		}
	}
}

