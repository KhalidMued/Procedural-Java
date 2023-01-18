package AAS_One;

import java.util.Scanner;

public class Lab_Two {

	public static void main(String[] args) {
	
		String op = "math";
		

		Scanner input = new Scanner(System.in);
		 
			
			System.out.print(" Enter The First Integer: ");
			int FirstInt = input.nextInt();
			System.out.print(" Enter The Second Integer: ");
			int SecondInt = input.nextInt();
			
			
		
			System.out.println(" Enter Pow, Min, or Max: " );
			String pow = input.nextLine();
			String min = input.nextLine();
			String max = input.nextLine();
			
			
			
			switch (op) {
			
			
			case "pow": System.out.print(  Math.pow(FirstInt,SecondInt) );break;
			case "min": System.out.print(  Math.min(FirstInt,SecondInt) );break;
			case "max": System.out.print(  Math.max(FirstInt,SecondInt) );break;
			default: System.out.print("Wring input");
			
			
			
			
			
			}
			
			
			
			
		
	
			
			
			

		
		
	}

}
