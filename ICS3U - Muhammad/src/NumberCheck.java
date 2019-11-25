import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		double division;
		System.out.println("Please enter a number: ");
		number = sc.nextInt();

		if (number > 0) {
			System.out.println("Your number is positive.");
		} else {

			System.out.println("Your number is negative");
		}

		division = (number % 7);

		if (division == 0) {

			System.out.println(number + " is divisible by 7.");
		} else {

			System.out.println(number + " is not divisible by 7.");
		}
	}
}
