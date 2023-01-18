package AAS_One;

import java.util.Scanner;  
import java.util.*;
import java.lang.Math; 

public class IFELSEPWR {

	
public static void main (String[] args) {
		
    Scanner input = new Scanner (System.in);
    
    

System.out.print(" Enter a First Int: ");
int N1 = input.nextInt();

System.out.print(" Enter a Second Int: ");
int N2 = input.nextInt();

System.out.println("Please enter pow , or min , or max: ");
String s=input.next();


int pow = (int) (Math.pow(N1,N2));
int min = (int) (Math.min(N1,N2));
int max = (int) (Math.max(N1,N2));



if ( s.equals("pow") ) {

    System.out.println(" The power is "+pow);
}

else if (s.equals("min")) {

    System.out.println(" The min is " + min);

}

else if (s.equals("max")) {

    System.out.println(" The max is " + max);
}



    
		}
			}
