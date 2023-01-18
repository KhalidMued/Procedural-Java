package Test;

import java.util.*;
public class Overloading_Method {

	public static void main(String[] args) {

	
		add();

		
		
		
	}
	
	public static void add() {
		
		
		Scanner input = new Scanner (System.in);

			System.out.print("Enter the First integer: ");
			int x = input.nextInt();
			System.out.print("Enter the Second integer: ");
			int y = input.nextInt();
		
		add(x,y);
			
	}
	
	public static void add( int x, int y ) {
	
		
		int result = x + y;
	
		System.out.print(" The total is: " + result );
		
	
	
	}
	

}
