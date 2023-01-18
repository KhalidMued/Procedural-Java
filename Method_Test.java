package Test;
import java.util.*;
public class Method_Test {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);


	System.out.print(" Enter an i Integer: ");
	int i = input.nextInt();
	System.out.print(" Enter an j Integer: ");
	int j = input.nextInt();

		int k = max(i , j);
		int f = min (i , j);
		double m = max (i , j);
		
		System.out.println(" The Integer Max Between " + i + " and " + j + " is: " + k + "\n");
		System.out.println(" The Min Between " + i + " and " + j + " is: " + f + "\n");
		System.out.println(" The Double Max Between " + i + " and " + j + " is: " + m);

	}

	
	public static int max ( int num1, int num2) {
		
		
		int result;
		
		if ( num1 > num2) 
			
			result = num1;
		
		else 
		
			result = num2;
		
		return result;
	}
	
	public static int min ( int num11, int num22) {
		
		
		int Solve;
		
		if ( num11 < num22) 
			
			Solve = num11;
		
		else 
		
			Solve = num22;
		
		return Solve;
	}
	
	public static double max ( double numm1, double numm2) {
		
		
		double Get;
		
		if ( numm1 > numm2) 
			
			Get = numm1;
		
		else 
		
			Get = numm2;
		
		return Get;
	}
}

