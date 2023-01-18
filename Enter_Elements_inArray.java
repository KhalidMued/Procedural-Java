package Test;
import java.util.*;
public class Enter_Elements_inArray {

	public static void main(String[] args) {
  
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Array length: ");
			int len=sc.nextInt();
			
			int a[]=new int[len];//declaration   
			System.out.print("Enter " + len + " Element to Store in Array:\n");
			
		                for(int i=0; i<len; i++) {
		                      a[i] = sc.nextInt();
		                   }  
		                
		                 System.out.print("Elements in Array are:\n");
		                 
		                 for(int i=0; i<len; i++) {
		                     System.out.print(a[i] + "  ");
		                  }  
		   }
		

	}


