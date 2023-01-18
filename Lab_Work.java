package Test;
import java.util.*;
public class Lab_Work {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Array Size
		System.out.print(" Enter The Array Size: ");
		int Size = input.nextInt();
		
		int ArrayAve [] = new int [Size];
		
		//Array Elements
		System.out.print(" Enter The Array Elements: ");
		
		for (int i=0; i<ArrayAve.length; i++) {
			
			ArrayAve[i] = input.nextInt(); 
		}
		//Print Array Elements
		for (int i=0; i<ArrayAve.length; i++) {
			
			System.out.print(ArrayAve[i] + " " );	
		}
		//Get Total to find Average
		int Total = 0;
		
		for (int i =0 ; i < ArrayAve.length ; i++) {
			
			 Total += ArrayAve[i]; 
		}
		
		System.out.println(" \n" + "The Summmation is: " + Total);
	//Find Average Using Total
		int Average = 0;
		
		for (int i=0; i<ArrayAve.length; i++) {
			
			Average = (Total/Size);
			
			}
		
		System.out.println(" \n" + "The Average is: " + Average);
		
		//If Bigger Print
		int bigger = 0;
		
		for (int i=0; i<ArrayAve.length; i++) {
			
			if ( ArrayAve[i] > Average) {
				
				System.out.println(" \n" + "The Elements bigger than Average is: " + ArrayAve[i]);
		
				}
				
			}
		
		
		//Flip the Array Elements order ( 3,2,1 ) instead of ( 1,2,3 )
		int ArrayFlip [] = new int [Size];
		
		for (int i=0; i<ArrayAve.length; i++) {
			
			ArrayFlip[i] = ArrayAve[Size];
			Size--;
	
			for (int j=0; j<ArrayAve.length; j++) {
			
				System.out.println(ArrayFlip[j]);
			
		}
		
	}

	
	

}
	
}
