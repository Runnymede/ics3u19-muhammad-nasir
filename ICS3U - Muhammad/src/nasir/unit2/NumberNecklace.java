package nasir.unit2;

import java.util.*;
public class NumberNecklace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first,second,t,u,result;

		
		do {
			System.out.println("Enter the first positive number: ");
			first = sc.nextInt();
			System.out.println("Enter the second positive number: ");
			second = sc.nextInt();
		} while (first <0 || second <0);
		
		t=first;
		u= second;
		
		
		do {
			result = (first+second)%10;
			System.out.println(result);
			
			first = second;
			second = result;
			
			
		}while (result != t && result != u);
	
	}

	
	}
	