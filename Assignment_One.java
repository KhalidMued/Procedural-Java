package AAS_One;

import java.util.Scanner;
public class Assignment_One {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int Highest = 0 ;
		int Lowest = 0 ;
		
		System.out.print(" Enter The Salary For the First Employee: ");
		int FirstSal = input.nextInt();
		System.out.print(" Enter The Salary For the Second Employee: ");
		int SecondSal = input.nextInt();
		System.out.print(" Enter The Salary For the Third Employee:");
		int ThirdSal = input.nextInt();
		
		
		// If Less than Zero Repeat Step
		
if (FirstSal < 0 ) {
        	
        	System.out.print(" Please enter a valid First Sal: ");
        	 FirstSal = input.nextInt();
  
        }
        
        else if (SecondSal < 0 ) {
        	
        	System.out.print(" Please enter a valid Second Sal: ");
        	
        	 SecondSal = input.nextInt();
  
        }
   
        else if (ThirdSal < 0 ) {
   	
   	System.out.print(" Please enter a valid Third Sal: ");
   	
   	 ThirdSal = input.nextInt();

   }

        
        // To See if There is a Duplicate
        
        if ( FirstSal == SecondSal || FirstSal == ThirdSal ) {
        	
        	 System.out.println(" \n Salaries Duplication is Found\n");
        	
        }
        
        else if ( ThirdSal == SecondSal ){
        	
        	 System.out.println(" \n Salaries Duplication is Found\n");
        	
        }
       
        
		//To Find The Highest and Lowest
	
		Highest = FirstSal;

   if ( SecondSal > Highest){

       Highest = SecondSal;

    }
    Highest = FirstSal;
     if ( ThirdSal > Highest ){
     Highest = ThirdSal;
    }

    Lowest  = FirstSal;  
    
    if ( SecondSal < Highest){

       Lowest = SecondSal;

    }
    Lowest  = FirstSal; 
    if ( ThirdSal < Highest ){
      Lowest = ThirdSal;

    }

    System.out.println(" The Highest Sal is: " + Highest);
    System.out.println(" The Lowest Sal is: " + Lowest);
       

	// To Find Average

double Average = (FirstSal + SecondSal + ThirdSal) / (3);
System.out.println(" The Average is: " + Average);


      
	}

}
