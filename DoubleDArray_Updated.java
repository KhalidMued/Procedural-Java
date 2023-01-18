package Test;


public class DoubleDArray_Updated {

	public static void main(String[] args) {




		//Declare 2D Array

		int[][] matrix = new int[3][3];





		//Let User Enter Elements for both Row(i) and Column(j)

		System.out.print("Enter the 2D Array Elements: ");

		for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {

		matrix[i][j] = (int) (Math.random() * 100); // it will be filled by row

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

		for (int j = 0; j < matrix[0].length; j++) {
		int ColumnTotal = 0;


		  for (int i = 0; i < matrix.length; i++) {

		  ColumnTotal += matrix[i][j];

		  }

		   System.out.println("Sum for Column " + j + " is "  + ColumnTotal);

		}

		System.out.println("----------------------------");

		//To Find the Sum of Each Row alone

		for (int i = 0; i < matrix.length; i++) {
		int RowTotal = 0;

		  for (int j = 0; j < matrix[0].length; j++) {

		  RowTotal += matrix[i][j];

		  }

		   System.out.println("Sum for Row " + i + " is "  + RowTotal);

		}

		System.out.println("----------------------------");

		//To Find  Largest Element in the matrix


		int Largest = matrix [0][0];
		for (int i = 0; i < matrix.length; i++) {
		for ( int j = 0; j < matrix[i].length; j++) {

		  if (  matrix[i][j] > Largest) {
		 
		  Largest = matrix[i][j];
		 
		 
		 
		  }
		}

		}
		   System.out.println(" The biggest element is " +Largest );




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

		System.out.println("----------------------------");

		
		
		//To Flip The Array
		
		int[][] Flip = new int[3][3];

		for ( int i=0; i < Flip.length; i++) {

		for ( int j=0; j < Flip[i].length; j++) {

		Flip[i][j] = matrix [j][i];
		}
		}

		System.out.println("The Flipped Array is: ");
		
		for ( int i=0; i < Flip.length; i++) {

		for ( int j=0; j < Flip[i].length; j++) {

		System.out.print(Flip[i][j] + "  ");
		}
		System.out.println();

		}





		
		}  
		  }

