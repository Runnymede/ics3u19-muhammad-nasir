package nasir.unit3;

import java.util.*;

public class IsoTriangle {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Please enter the size you want your triangle to be: ");
		int size = sc.nextInt();
		printStars(size);
	}

	public static void printStars(int a) {
		for (int i = 0; i < a; i++) {
			drawSpaces(a - i);
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void drawSpaces(int n) {
		for (int j = n; j > 1; j--) {
			System.out.print(" ");
		}
	}

}
