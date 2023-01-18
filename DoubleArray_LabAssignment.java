package Test;

public class DoubleArray_LabAssignment {

	public static void main(String[] args) {
		//Declare a Double Array 3x3
		int[][] Array = new int [3][3];
		
		for (int i = 0; i<Array.length; i++) {
			for (int j = 0; j<Array[i].length;j++) {
				Array[i][j] = (int) (Math.random() * 100);				
				
			}
		}
		
		//Print the Double Array
		System.out.println("The Array is: ");
		for (int i = 0; i<Array.length; i++) {
			for (int j = 0; j<Array[i].length;j++) {
				
				System.out.print(Array[i][j]+ "  ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		//Find the Sum of all the elements in the 2D Array
		int Sum = 0;
		for (int i = 0; i<Array.length; i++) {
			for (int j = 0; j<Array[i].length;j++) {
				
				Sum += Array[i][j];			
				}
		}
		System.out.println("The Sum is" +Sum);
		System.out.println("---------------");

		//Find only the ODD elements in the 2D Array
		int Odd = 0;
		for (int i = 0; i<Array.length; i++) {
			for (int j = 0; j<Array[i].length;j++) {
				if ( Array[i][j] % 2 != 0) {
				Odd = Array[i][j];	
				System.out.println("  " + Odd + " is an Odd number ");
				}
				
				}
		}



	}

}
