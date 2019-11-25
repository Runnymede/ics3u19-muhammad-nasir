package nasir.unit3;

import java.util.Scanner;

/**
 * 
 * @author 344979026
 *
 */
public class NameListArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Please enter the numbers of names on your list: ");
		int listnum = sc.nextInt();
		String[] names = new String[n];

		System.out.println("Please enter the names one by one: ");
		for (int list = 0; list < n; list++) {
			names[list] = sc.nextLine();
		}

	}

}
