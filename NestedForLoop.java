package com.tnsif.controlstatements;

public class NestedForLoop {

	public static void main(String[] args) {
		// 
		
		for(int i=2;i<=10;i++)                //create table of 2 to 10
		{ 
			for(int j=1;j<=10;j++)          //multiply i from 1 to 10 to get table of each 
			{
				System.out.println(i*j);
			}
			   System.out.println();	
		}

	}

}
