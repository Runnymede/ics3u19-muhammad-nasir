package nasir.unit3;

import java.util.*;
public class DiceArrays {

	public static void main(String[] args) {
		//Entry point of the program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------Dice Simulator------------");
		
		//Declaring and initializing an array called totals, with a size of 10000.
		int array [] = new int [10000];
		//Random Object "num", when called upon it prints a random number between 0 and the number you have specified.
		Random num = new Random();
		int total=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
		//The following for loop gets the numbers rolled on the dice and stores them into the array.
		for(int i=0; i<10000; i++) {
			int roll1 = num.nextInt(7);
			int roll2 = num.nextInt(7);
			total = roll1 + roll2;
			array[i] = total;
		
		}
		//The following loop goes through the array and counts how many times out of 10000 a number has been rolled the dice. 
		for (int i=0; i<10000; i++) {
			if (array[i] == 2) {
				count2 ++;
			}
			if (array[i] == 3) {
				count3 ++;
			}
			if (array[i] == 4) {
				count4 ++;
			}
			if (array[i] == 5) {
				count5 ++;
			}
			if (array[i] == 6) {
				count6 ++;
			}
			if (array[i] == 7) {
				count7 ++;
			}
			if (array[i] == 8) {
				count8 ++;
			}
			if (array[i] == 9) {
				count9 ++;
			}
			if (array[i] == 10) {
				count10 ++;
			}
			if (array[i] == 11) {
				count11 ++;
			}
			if (array[i] == 12) {
				count12 ++;
			}
		
		}
	// The following statements print out the totals.
		System.out.println("Total 2: " + count2);
		System.out.println("Total 3: " + count3);
		System.out.println("Total 4: " + count4);
		System.out.println("Total 5: " + count5);
		System.out.println("Total 6: " + count6);
		System.out.println("Total 7: " + count7);
		System.out.println("Total 8: " + count8);
		System.out.println("Total 9: " + count9);
		System.out.println("Total 10: " + count10);
		System.out.println("Total 11: " + count11);
		System.out.println("Total 12: " + count12);
	
	}
	
}
//End of code
