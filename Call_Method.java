package Test;
import java.util.*;
public class Call_Method {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			System.out.print(" Enter a Value for A: ");
			int A = input.nextInt();
			System.out.print(" Enter a Value for B: ");
			int B = input.nextInt();
			
			Find (A,B);
		
	}

	
	
	public static void Find (int A, int B) {

		if (A > B) {
			
			Add (A,B);
		}
		
		else
		
			Sub (A,B);
	}
	public static void Add (int A, int B) {
		
			System.out.print("The Answer is: " + (A + B));
				
				
			}
	public static void Sub (int A, int B) {
		
		System.out.print("The Answer is: " + (A - B));
			
		}
		
	}

