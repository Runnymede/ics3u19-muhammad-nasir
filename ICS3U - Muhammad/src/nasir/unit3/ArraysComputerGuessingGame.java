package nasir.unit3;

import java.util.*;

public class ArraysComputerGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random num = new Random();

		// ----------------------------------------- //
		String fruits[] = new String[20];
		fruits[0] = "apple";
		fruits[1] = "banana";
		fruits[2] = "orange";
		fruits[3] = "cantaloupe";
		fruits[4] = "watermelon";
		fruits[5] = "pomegranate";
		fruits[6] = "strawberry";
		fruits[7] = "cherry";
		fruits[8] = "grape";
		fruits[9] = "peach";
		fruits[10] = "pineapple";
		fruits[11] = "blueberry";
		fruits[12] = "kiwi";
		fruits[13] = "guava";
		fruits[14] = "pupaya";
		fruits[15] = "plums";
		fruits[16] = "raspberry";
		fruits[17] = "apricot";
		fruits[18] = "coconut";
		fruits[19] = "dragonfruit";
		// -------------------------------------------- //
		String userInput;
		int indexArray[] = new int[20];
		System.out.println(
				"Hey, lets play a guessing game. Think of a fruit. Enter y if i guess correctly, n otherwise.");

		do {

			int index = num.nextInt(20);

			System.out.println("Are you thinking of: " + fruits[index]);
			userInput = sc.next();
			if (userInput.contentEquals("y")) {
				System.out.println("I have guessed your fruit. I win!");
			}

		} while (!userInput.contentEquals("y"));

	}

}
