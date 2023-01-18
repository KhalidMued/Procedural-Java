package AAS_One;

import java.util.Scanner;
public class IfEven {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter a Number to check if Even or Odd: " );
		int Num = input.nextInt();
		
		if (Num % 2 == 0) {

			System.out.println(" Its Even ");
	
		}
		
		else {
			
			System.out.println(" Its Odd ");


			
		}
	}

}
