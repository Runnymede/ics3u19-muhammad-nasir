package nasir.unit2;

import java.util.Scanner;

public class StringThings {

	public static void main(String[] args) {
		
		//Start of code:
		Scanner c = new Scanner(System.in);
		String word;
		int length;
		
		// The following block gets and stores the users input. 
		System.out.println("Please enter a word that is atleast 7 charectars long: ");
		word = c.next();
		System.out.println();
		
		//This block displays the users word in all caps.
		word = word.toUpperCase();
		System.out.println("All UpperCase: " + word);
		System.out.println();

		//This block displays the users word in all lower case letters.
		word = word.toLowerCase();
		System.out.println("All LowerCase: " + word);
		System.out.println();
		
		//This block gives you the length of the users word.
		length = word.length();
		System.out.println("Length = " + length);

		System.out.println();
		
		// The following block will display the char at the index number requested by the user.
		System.out.println("Index of char to be printed: ");
		int index = c.nextInt();
		System.out.println("The char at the index " + index + " is: " + word.charAt(0));
		System.out.println("\n\n\n\n\n");
		//Task ones code ends here.

		// Task 2
		//The code for task two begins here.
		//Gets the users input and stores it in "input1"
		System.out.println("Please enter the first word:");
		String input1 = c.next();

		System.out.println();

		System.out.println("Please enter the second word: ");
		String input2 = c.next();

		int comparison;

		comparison = input1.compareTo(input2);
if(comparison == 0) {
	System.out.println("The strings are the same");
}
else if (comparison > 0) {
	System.out.println(input2+" comes alphabetically before "+ input1);
}
else System.out.println(input1+" comes before "+ input2);
	

		System.out.println("\n\n\n\n\n");
		
		// task 3

		String username = ("AdminOne");

		String password = ("WoodChuck!1");

		System.out.println("Please enter the username: ");
		String login = c.next();
		System.out.println();
		System.out.println("Please enter the password: ");
		String code = c.next();
		if (login.equals(username) && code.contentEquals(password)) {
			System.out.println("Welcome! " + username);
		} else {
			System.out.println("Your username or password is incorrect.");
		}
		

	}

}
