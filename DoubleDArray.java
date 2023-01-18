package Test;
import java.util.*;
public class DoubleDArray {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
//Declare 2D Array
int[][] matrix = new int[4][4];


//Let User Enter Elements for both Row(i) and Column(j)
System.out.print("Enter the 2D Array Elements: ");
	for (int i = 0; i < matrix.length; i++) { 
		
		for (int j = 0; j < matrix[i].length; j++) {
			matrix[i][j] = input.nextInt(); // it will be filled by row
			

		}
			}
	System.out.println("----------------------------");
	System.out.println("The 2D Array Elements is: ");

	

	//Print 2D Array as Matrix
	for (int i = 0; i < matrix.length; i++) { 
		
		for (int j = 0; j < matrix[i].length; j++) {
	
			System.out.print(matrix[i][j] + "   ");

		}
		System.out.println();
			}
	System.out.println("----------------------------");

	 //Find The Sum of all the Matrix Elements
	int Sum = 0;

	for (int i = 0; i < matrix.length; i++) { 
	
		for (int j = 0; j < matrix[i].length; j++) {

			Sum += matrix[i][j];
			
		}
			}

	System.out.println("The Sum is: " +Sum);
	System.out.println("----------------------------");


//To Find the Sum of Each Column alone
int ColumnTotal = 0;
	for (int i = 0; i < matrix[0].length; i++) {
	
	  	for (int j = 0; j < matrix.length; j++) {
	    ColumnTotal += matrix[i][j];
	  	}
	    System.out.println("Sum for column " + i + " is " 
			    + ColumnTotal);
	}
	System.out.println("----------------------------");
	

	//Shuffling the Matrix Process
	for (int i = 0; i < matrix.length; i++) {
		  for (int j = 0; j < matrix[i].length; j++) {
			  
		    int i1 = (int)(Math.random() * matrix.length);
		    int j1 = (int)(Math.random() * matrix[i].length);
		    
		    // Swap matrix[i][j] with matrix[i1][j1]
		    int temp = matrix[i][j];
		    matrix[i][j] = matrix[i1][j1]; 
		    matrix[i1][j1] = temp;
		    
		  }
		}
	System.out.println("The Matrix After Shuffling is:");

for (int i = 0; i < matrix.length; i++) { 
		
		for (int j = 0; j < matrix[i].length; j++) {
	
			System.out.print(matrix[i][j] + "   ");

		}
		System.out.println();
			}




  }
	}
