package nasir.unit2;

import java.util.Scanner;

/**
 * This program will give the user math problems to solve and will verify if
 * their answers are correct or not.
 * 
 * @author Muhammad Nasir October 24th,2019
 * @param args
 * 
 */
public class MathTutor {

	// Entry point of the code
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		// The following block generates 2 random numbers and a third random number
		// which will identify the operation in the math problem
		int randomnum1 = (int) (Math.random() * 10) + 1;
		int randomnum2 = (int) (Math.random() * 10) + 1;
		int operatorsnum = (int) (Math.random() * 4) + 1;

		// variables declared
		String operator;
		double result ;
		
		
		double userinput;

		// The following block of code is a nested if else if statement which outputs
		// the math problem and checks the answers
		if (operatorsnum == 1) {
			operator = ("+");
			result = randomnum1 + randomnum2;
			System.out.println("What is " + randomnum1 + operator + randomnum2 + " ?");
			userinput = c.nextInt();

			if (userinput == result) {
				System.out.println("You are correct!");
			} else
				System.out.println("You are wrong");
			System.out.println("The correct answer is: " + result);
		
		} else if (operatorsnum == 2) {
			operator = ("-");
			result = randomnum1 - randomnum2;
			System.out.println("What is " + randomnum1 + operator + randomnum2 + " ?");
			userinput = c.nextInt();

			if (userinput == result) {
				System.out.println("You are correct!");
			} else
				System.out.println("You are wrong");
			System.out.println("The correct answer is: " + result);
		}
		
		else if (operatorsnum == 3) {
			operator = ("*");
			result = randomnum1 * randomnum2;
			System.out.println("What is " + randomnum1 + operator + randomnum2 + " ?");
			userinput = c.nextInt();

			if (userinput == result) {
				System.out.println("You are correct!");
			} else
				System.out.println("You are wrong");
			System.out.println("The correct answer is: " + result);
	
		} else {
			operator = ("/");
			result = randomnum1 / randomnum2;
			System.out.println("What is " + randomnum1 + operator + randomnum2 + " ?");
			userinput = c.nextInt();

			if (userinput == result) {
				System.out.println("You are correct!");
			} else
				System.out.println("You are wrong");
			System.out.println("The correct answer is: " + result);
	
			result= Math.round(result*100)/100.0;
		}

	}

	// End of code

}
