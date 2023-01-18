package AAS_One;

import java.util.Scanner;
public class EX_1 {

	
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter The Temp. in Fahrenheit:");
		double FTemp = input.nextDouble();
		
		double C = (FTemp - 32) * (5.0) / (9.0);
		
		System.out.print( "\t" + FTemp + " Degree Fahrenheit  = " + C + " Degree Celcuis" );
		
		
		
	}

}
