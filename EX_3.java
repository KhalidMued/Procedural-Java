package AAS_One;

import java.util.Scanner;
public class EX_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter The Value in Feet:");
		double Feet = input.nextDouble();
		
		double Meter = (Feet) * (0.305);
		System.out.print( "\n" + Feet + " Feet is " + Meter + " Meters");
		

	}

}
