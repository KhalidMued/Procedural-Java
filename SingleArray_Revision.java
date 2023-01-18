package Test;
import java.util.*;
public class SingleArray_Revision {

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);


		//Initialize Array Size
		System.out.print("Enter the Array Size: ");
		int len = input.nextInt();

		//Declare an Array
		int Array [] = new int [len];

		//Let Array Elements be random till 99
		for (int i = 0; i < Array.length; i++) {
		Array[i] = (int) Math.floor((Math.random() * 100));

		}

		//Print Array Elements
		System.out.println("Array elements Are: ");
		for (int i = 0; i < Array.length; i++) {
		System.out.print(Array[i] + "  ");

		}
		
		System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 


		//Sum All Array Elements
		int Total =0;
		for (int i = 0; i < Array.length; i++) {
		Total += Array[i];

		}
		System.out.println("The Sum is: " +Total);

		System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 

		//Find and Print the Average of the Array
		int Average = 0;
		//for (int i = 0; i < Array.length; i++) {

		Average = (Total) / (len);

	//	}

		System.out.println("The Average is " +Average);

		System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 

		//Find Max of Array
		int Max = Array[0];
		for (int i = 1; i < Array.length; i++) {
		if ( Array[i] > Max) {
		Max = Array[i];
		}

		}
		System.out.println("The Max is: " +Max);
		System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 

		//Find Mix of Array
		int Min = Array[0];
		for (int i = 1; i < Array.length; i++) {
		if ( Array[i] < Min) {
		Min = Array[i];
		}

		}
		System.out.println("The Min is: " +Min);

		System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 


		//Find How many Elements are above Average
		int count=0;
		for (int i = 0; i < Array.length; i++) {

		if ( Array[i] > Average) {

		count ++;
		}
		}

		System.out.println("There is " + count +" elements Above Average");
		System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 

		//Print Elements above Average
		for (int i = 0; i < Array.length; i++) {

		if ( Array[i] > Average) 

		System.out.println("The Elements Above Average is: " +Array[i]); 
		}
		

	System.out.println("\n" + " ---------------------------------------------------------------- "+ "\n" ); 
	
	//Random Shuffling
	
	//Declare New Array for Shuffling
	String Shuff [] = {"Cat", "Dog", "Horse", "Cow"};

	System.out.println("Before Shuff Array is: ");
	
	for ( int i=0; i < Shuff.length; i++) {

	System.out.println(Shuff[i]);
	}


	System.out.println("\n"+ "Shuff Proccess " + "\n");
	for ( int i=0; i < Shuff.length; i++) {

	int index = (int) (Math.random() * Shuff.length);
	System.out.println(index + "\t" + Shuff[index] + "\t" + Shuff[i]);
	//Switch Elements from that position with the currant one
	String temp = Shuff[i];
	Shuff[i] = Shuff[index];
	Shuff[index] = temp;

	}

	System.out.println("\n"+ "After Shuff Array is: ");
	for ( int i=0; i < Shuff.length; i++) {

	System.out.println(Shuff[i]);
	}




	
		}
	}
	
	
	