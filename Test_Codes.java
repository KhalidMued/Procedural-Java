// Calculate The Factorial.

package Test;

import java.util.*;
public class Test_Codes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int Factorial = 1;
		
		System.out.print(" Enter a number to find its Factorial: ");
		int num = input.nextInt();
		
		for ( int i = 1; i<=num; i++) {
			
			Factorial *=  i;
			
			
		}
	
		System.out.print(" The Factorial of " + num + " is " + Factorial);
		
	}

}
