package nasir.unit1;

import java.util.Scanner;
/**
 * This program will calculate the two square roots of three values.
 * @author Muhammad Nasir
 * October 1st,2019
 */
public class QuadraticFormula {
	/**
	 * 	Entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	

		
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		System.out.println("Please enter value a");
		a= sc.nextDouble();
		System.out.println("Please enter value b");
		b= sc.nextDouble();
		
		
		System.out.println("Please enter value c");
		c= sc.nextDouble();
		
		x1= ((-1*b) + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a); 
		
		x2= ((-1*b) - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		System.out.println("Root 1 is: " + x1);
		
		System.out.print("Root 2 is: " + x2);

	
	
		/*
		 * This is the end of the code
		 */

	

	}

}








