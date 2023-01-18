package Test;

public class ShiftSingleArray {

	public static void main(String[] args) {
	int[] Array = {1, 2, 3, 4, 5 };
		
		Shift(Array);
	

	}
	
	public static int[] Shift ( int[] Array) {
		
		int [] NewArray = new int [Array.length];
		
		for ( int i=1; i< NewArray.length; i++) {
			
			NewArray[i] = Array[i-1];
		}
		
		NewArray[0] = Array[Array.length -1];
		
		System.out.print("The Shifted Array is: ");

		for ( int i = 0 ; i< NewArray.length; i++) {
			
			System.out.print(NewArray[i]);
		}
		
		return NewArray;
		
	}

}
