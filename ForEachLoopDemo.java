package com.tnsif.controlstatements;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		// used to iterate over the arrays, strings and collections
     
		int arr[]={10,20,30,40,50};        //read array elements from 1st to last element
		 for(int a:arr)
		 {
			 System.out.println(a);       //automatically increament the variable to get next element in an array
		 }
		 
		 System.out.println();           // for space
		 
		 // foreach for character
		 char ch[]={'A','B','C','D','E'};
		 for(char i:ch)
		 {
			 System.out.println(i);
		 }
		 System.out.println();            // for space
		 //foreach for String
		 String str[]={"Hello" , "Everyone","How","are","You"};
		 for(String s:str)
		 {
			 System.out.println(s);
		 }
	}

}
