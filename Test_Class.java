package AAS_One;


import java.util.Scanner;
public class Test_Class {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter The Year : ");
		int Year = input.nextInt();
		
		switch ( Year % 12){
		
		case 0: System.out.print(" Monkey"); break;
		case 1: System.out.print(" Roaster"); break;
		case 2: System.out.print(" Dog"); break;
		case 3: System.out.print(" Pig"); break;
		case 4: System.out.print(" Rat"); break;
		case 5: System.out.print(" Ox"); break;
		case 6: System.out.print(" Tiger"); break;
		case 7: System.out.print(" Rabbit"); break;
		case 8: System.out.print(" Dragon"); break;
		case 9: System.out.print(" Snake"); break;
		case 10: System.out.print(" Horse"); break;
		case 11: System.out.print(" Sheep"); break;
		default: System.out.print(" Wrong");
		
		}
		
		
		
	}

}
