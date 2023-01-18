package Test;

public class ReverseArrayTest {

	public static void main(String[] args) {
		int[] Array = {1, 2, 3, 4, 5, 6};
		
		System.out.print("The Reversed Array is: ");
		reverse(Array);

	
		}
	
	public static int[] reverse(int[] Array) {
		
		  int[] Result = new int[Array.length];
		
		  for (int i = 0, j = Result.length - 1; 
		       i < Array.length; i++, j--) {
		    Result[j] = Array[i];
		  }
		  
		  for ( int i = 0; i < Result.length; i++) {
			  
			  System.out.print(Result[i]);
			  
		  }
		
		  return Result;
		}

}

