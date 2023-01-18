package AAS_One;

import java.util.*;
public class Switch_Example {
	
	
	    public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        
	        int variable;
	        System.out.println("Please enter the variable value");
	        
	       variable=input.nextInt();
	        
	        switch(variable)
	        {
	            case 1:
	            System.out.println("The value of the variable = "+variable);break;
	            
	            case 2:
	            System.out.println("The value of the variable ="+variable);break;
	            
	            case 3:
	            System.out.println("The value of the variable ="+variable);break;
	            
	            default:
	            System.out.println("The value of the variable is neither 1 nor 2 nor 3");
	            
	            
	        }
	    }
	}


