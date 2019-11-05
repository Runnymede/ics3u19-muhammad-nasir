package nasir.unit2;
import java.util.Scanner;
/**
 * This program will calculate the weight and the size of the users package and tells them if it is too heavy,large or
 * @author Muahammad Nasiat the perfect amount required.k
 * October 16,2019
 */
public class PackageCheck {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Please enter the weight of the package: ");
		int weight= c.nextInt();
		
		System.out.println("Please enter the length of the package: ");
		double length= c.nextDouble();
		
		System.out.println("Please enter the width of the package: ");
		Double width= c.nextDouble();
		
		System.out.println("Please enter the height of the package: ");
		Double height= c.nextDouble();
		
	double volume = Math.round(length*width*height);
	
	if(weight>27 && volume >100000) {
		
		System.out.println("Your package is too heavy and too large");
	}
	else if (weight<27 && volume < 100000){
		System.out.println("Your package has been accepted. Thank you for your coaporation.");
	}
	
	else if (weight>27 && volume<100000) {
		System.out.println("Your package is too heavy");
	}
	else 
		System.out.println("your package is too large");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


