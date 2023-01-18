package Test;
import java.util.*;

public class Array_User_Input {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		//Initialize Array Size
		System.out.print("Enter the Array Size: ");
		int Size = input.nextInt();
		
		
		//Define Array with the size of "Size"
		int MyList [] = new int [Size];
		
		
		//Enter Array Elements
		System.out.print("Enter the Array Elements: ");
		
		for (int i =0 ; i < Size ; i++) {
			
			MyList[i]=input.nextInt();
		}

		//Print Array Elements
		for (int i =0 ; i < MyList.length ; i++) {
			
			System.out.print(MyList[i] + " ");
		}
		
		
		//Find Summation of Array
		int Total = 0;
	
		for (int i =0 ; i < MyList.length ; i++) {
			
			 Total += MyList[i]; 
		}
		System.out.println(" \n" + "The Summmation is: " + Total);
		
		
		//Find Max Element in the Array ( Assume that the first element in the array is the max then compare with it )
		int max = MyList[0];
		for (int i =1 ; i < MyList.length ; i++) {
			
			 if ( MyList[i] > max) {
				 
				 max = MyList[i];
			 }
		}
		System.out.println(" \n" + "The Maximum Element is: " + max);
		
		
		//Randomize Array Elements
		System.out.println(" \n" + "The Random Array Elements Are: " + " \n");
		//New Array for Random
		double Random [] = new double [3];
		
		for (int i =0 ; i < Random.length ; i++) {
			
			Random[i]=Math.random() * 100;
		}

		
		for (int i =0 ; i < Random.length ; i++) {
			
			System.out.print(Random[i]+ " ");
		}
	
	


	}

}
