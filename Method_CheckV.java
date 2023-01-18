//Check if a Letter is a Vowel 


package Test;
import java.util.*;
public class Method_CheckV {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
	System.out.print(" Enter a letter to see if Vowel: ");
	char V = input.next().charAt(0);
	
	 CheckV (V);
		
	}

	public static void CheckV (char V) {
		
		char z= 'a';
		char x = 'e';
		char c = 'i';
		char b = 'o';
		char n = 'u';
		
		if ( V == z ||  V == x || V == c||  V == b ||  V == n) {
			
			System.out.print( " Its a Vowel");
			
		}
		
		else {
			
			System.out.print( " Its Not a Vowel");
			
			}
			
			
		
		
	}
}
