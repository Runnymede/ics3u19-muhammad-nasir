package nasir.unit2;

import java.util.*;

/**
 * The following program checks and outputs the number of vowels in the
 * statement given by the user. For Example: user input= "Its raining cats"
 * Output: The number of vowels in this statement are: 4
 * 
 * @author Muhammad Nasir November 14,2019
 */
public class VowelsProgram {

	public static void main(String[] args) {
		// Entry point of the code.
		// variables declared.
		int i = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		// The following 2 lines take the users statement and store it in the variable
		// "statement".
		System.out.println("Enter a statement:");
		String statement = sc.nextLine();

		// The following do while loop goes through each letter in the statement and
		// adds one to the count if the letter is a vowel or else moves on to the next
		// letter. It does this until the end of the statement.
		do {
			if (statement.charAt(i) == 'a') {
				count++;
				i++;
			} else if (statement.charAt(i) == 'e') {
				count++;
				i++;
			} else if (statement.charAt(i) == 'i') {
				count++;
				i++;
			} else if (statement.charAt(i) == 'o') {
				count++;
				i++;
			} else if (statement.charAt(i) == 'u') {
				count++;
				i++;
			} else {
				i++;
			}

		} while (i < statement.length());

		System.out.println("The number of vowels in this statement are: " + count);
	}
}
//End of code.
