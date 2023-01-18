package Test;
import java.util.*;
public class Increment_Method_Examble {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
	
		
		
		System.out.print(" Enter a starting Double: ");
		double st = input.nextDouble();
		
		System.out.print(" Enter an Ending Double: ");
		double en = input.nextDouble();
		
		Range ( st , en) ;
		
		System.out.println(" -------------------- ");
		
		System.out.print(" Enter a starting int: ");
		int s = input.nextInt();
			
		System.out.print(" Enter an Ending int: ");
		int e = input.nextInt();
			
		
		Range ( s , e) ;
		

	}

	
	public static void Range (int start, int end) {
		

		
		for ( int i = start; i<=end; i++) {
	
		System.out.println(i);
		
		}
	
		
	}
	
	
	
	public static void Range (double st, double en) {
		

		
		for ( double i = st; i<=en; i++) {
	
		System.out.println(i);
		
		}
	
		
	}
			

	
	

}

