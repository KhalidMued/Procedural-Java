package Test;

import java.util.*;

public class SingleArray_Shifting {

	public static void main(String[] args) {
		
		System.out.println("\n " +"Original Array");
int[] arr = { 1,2,3,4,5 };

for (int i = 0; i < arr.length; i++) {
	
	System.out.print(arr[i]);
}

System.out.println("\n " +"Shifted Array");
Shift(arr);
arr=Shift(arr);

for (int i = 0; i < arr.length; i++) {
	
	System.out.print(arr[i]);
}

System.out.println("\n " +"Reversed Array");

Reverse(arr);
arr=Reverse(arr);

for (int i = 0; i < arr.length; i++) {
	
	System.out.print(arr[i]);
}


	}
	

		
	
public static int[] Shift (int[] arr) {
		
		int [] NewArray = new int [arr.length];
		
		for ( int i=1; i< NewArray.length; i++) {
			
			NewArray[i] = arr[i-1];
		}
		
		NewArray[0] = arr[arr.length -1];
		return NewArray;
		
		
		
	}



public static int[] Reverse (int[] arr) {
	
	int [] Rev = new int [arr.length];
	
	for ( int i=0, j=Rev.length - 1; i<arr.length; i++, j--) {
		
		Rev[j] = arr[i];
		
	}
	


	
	return Rev;
	
	
}

}
