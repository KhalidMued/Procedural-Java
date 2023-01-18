// Multiplication Table of a positive integer entered by the user. If the Integer is a Negative Number
// Give a ERROR Message. Then FLip the Multiplication Table to Start for 10 to 1


package AAS_One;
import java.util.Scanner;
public class Lab_Assignment {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print(" Enter a Positive integer: ");
		int Num = input.nextInt();
		
		
		if ( Num >= 0) {
			
			System.out.println(" The Multiplication Table of: " + Num );
			
			for ( int i = 10; i>=1; i--) {
				
				System.out.println(Num + " * " + i + " = " + (Num*i));
				
				
			}
			
		}
		
		
		else {
			
			System.out.println("ERORR! Enter a Positive Integer: ");
			

		if ( Num < 0) {
				
				
					Num = input.nextInt();
				
					System.out.println(" The Multiplication Table of: " + Num );
					
					
					for ( int i = 10; i>=1; i--) {
						
						System.out.println(Num + " * " + i + " = " + (Num*i));
					}
						
						}
				

			}	

		
		
		
	}

}
