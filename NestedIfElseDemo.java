package com.tnsif.controlstatements;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// It is type of low level Unit Testing. We check for multiple conditions at a time
		
		int A=10, B=15, C=20;
		
		if(A>B)
		{
			if(A>C)
			
			    System.out.println("A is the largest number"); //True
		    
			else
			
				System.out.println("C is the largest number");  // False
				
			}else{
				if(B>C)
					System.out.println("B is the largest number");  //True
				else
					System.out.println("C is the largest number");  //False
			}
	}

}
