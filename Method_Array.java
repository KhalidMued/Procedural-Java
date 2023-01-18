package Test;
import java.util.*;
public class Method_Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		System.out.println("Enter The Numbers For X");
		int[] x = new int[3];
		for (int i = 0; i<3; i++) {
             x[i]=input.nextInt();
		}
		
		System.out.println("Enter The Numbers For Y");
	    int[] y = new int[3];
	    for (int i=0; i<3; i++) {
	    	y[i]=input.nextInt();
	    }
	    
	    sum(x,y);		
	    IfEven(x,y);
	    
		}
	
      public static void sum(int x[], int y[]) {
    	  
    	  for (int i =0; i<3; i++) {
  			System.out.println(" The Multiplication is: " + x[i] * y[i]);
  		}
      }
      
      
      public static void IfEven(int x[], int y[]) {
    	  
    	  for (int i =0; i<3; i++) {
    		   if ( (x[i] * y[i]) % 2 == 0 ) {
    			   System.out.println( x[i] * y[i] +  " is Even " );
    		   }
    	  	}
    	  
    	  
    	  
    	  
      		}
      
	}



