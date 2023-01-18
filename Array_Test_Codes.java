package Test;
import java.util.*;
public class Array_Test_Codes {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a Value: ");
		int key = input.nextInt();
		
		double Random [] = new double [10];
		
		for (int i =0 ; i < Random.length ; i++) {
			
			Random[i]=Math.floor(Math.random() * 100);
		}

		
		for (int i =0 ; i < Random.length ; i++) {
			
			System.out.print(Random[i]+ " , ");
		}
		
		Check(random,key);
	
	}
	
	public static int[] Check(int[] random, int key) {
		
		
		  for (int i = 0;  i < random.length; i++) {
			  if (key == random [i]) 
			 
		return key;
	}
}
	
}
