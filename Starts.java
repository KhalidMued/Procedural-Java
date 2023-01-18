package AAS_One;
import java.util.Scanner;
public class Starts{

	public static void main(String[] args) {

	
		int s1;
		int s2;

		    
	Scanner input = new Scanner(System.in);
	
		    System.out.print("Enter Number of Row: ");
		    int  row =input.nextInt();
		  
		    
		    for (int i=0;i<=row;i++) {
		        
		        s1=2*i-1;
		        s2=2*row-1;
		        
		        for(int k=0;k<=s2-i;k++)
		        {
		        	 System.out.print("  ");
		        }
		        
		        for(int j=1;j<=s1;j++)
		        {
		        	 System.out.print("* ");
		        }
		        System.out.print("\n\n");
		    }
	} 
}
