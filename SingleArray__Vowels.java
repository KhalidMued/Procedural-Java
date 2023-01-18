package Test;
import java.util.*;

public class SingleArray__Vowels {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String [] Vow ={"e","i","o","a","u"};
		
		
		System.out.println("Enter a State to check if vowel in their: ");
		String Check = input.nextLine();
		
		System.out.println("The State is: " + Check);
		
		int Count = 0;
		for (int i = 0; i < Vow.length; i++) {
			
			for ( int j = 0; j < Check.length(); j++) {
				if ( Vow[i] == Check) {
					
					Count ++;
				}
		
				
			}
		}
		
		System.out.println("The Vowel is: " + Count);
		
	}

}
