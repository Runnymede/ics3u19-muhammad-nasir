package nasir.unit3;

import java.util.Scanner;
public class NameListArrays {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of names in list: ");
		int numNames = sc.nextInt();
		
		String array [] = new String [numNames];
		String name;
		
		//Storing names into array by asking user for input
		for (int i=0; i<numNames; i++) {
			System.out.println("Enter name to be stored at position " + i);
			name = sc.next();
			array[i] = name;
		}
	
		//Printing out in order it was inserted
		System.out.println("Printing in order that it was stored.");
		for(int i=0; i<numNames; i++) {
			System.out.println(array[i]);
		}
		System.out.println(' ');
		//Printing in reverse;
		System.out.println("Printing in reverse order.");
		for(int j = (numNames-1); j>=0; j--) {
			System.out.println(array[j]);
		}
	}
}
