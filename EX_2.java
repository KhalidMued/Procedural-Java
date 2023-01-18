package AAS_One;

import java.util.Scanner;
public class EX_2 {

	public static void main(String[] args) {
		
		// CONSTANT PI
		final double pi = 3.14;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter The Radius of The cylinder: ");
		double Radius= input.nextDouble();
		
		System.out.print(" Enter The Length of The cylinder: ");
		double Length= input.nextDouble();
		
		// Calculation
		
		double Area = (Radius) * (Radius) * (pi);
		
		double Volume = (Area) * (Length);
		
		System.out.println(" The Area of the Cylinder is " + Area);
		System.out.print(" The Volume of the Cylinder is " + Volume);
		
		

	}

}
