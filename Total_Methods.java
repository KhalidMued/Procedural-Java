package Test;
import java.util.*;
public class Total_Methods {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter A: ");
		int A = input.nextInt();
		
		System.out.print(" Enter B: ");
		int B = input.nextInt();
		
		System.out.print(" Enter C: ");
		int C = input.nextInt();
		
		Print_Total(A,B,C);
		
	}
	
public static int Check_Total ( int A, int B, int C) {
		
	
		int Sum = A + B + C;
		
		return Sum;
	}
	
	public static void Bounus_5(int A, int B, int C) {
		
		
	
		if (  Check_Total(A,B,C) < 100) {
		
			System.out.print( " The Total is: " + ( A + B + C ) * (5) );
			
		}
		
	}
	
	
	public static void Bounus_10 (int A, int B, int C) {
	
		
		if ( Check_Total(A,B,C) > 100) {
			
			System.out.print( " The Total is: " + ( A + B + C ) * (10) );
			
			}
	
	}
	
	

	public static void Print_Total ( int A, int B, int C) {

		
	
		
		if ( Check_Total(A,B,C) < 100) {
			
			Bounus_5 (A,B,C);
			
		}
		
		else if ( Check_Total(A,B,C) > 100) {
			
			Bounus_10 (A,B,C);
			
		}
		
	}
	
	
		
		
	}



