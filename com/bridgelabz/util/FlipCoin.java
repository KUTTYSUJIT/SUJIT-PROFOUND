/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin
 *  
 *  Purpose: Simulate a coin flip and print out "Heads" or "Tails".
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class FlipCoin
{ 
  	public  static void main(String[] args)
	{	
		int number=Integer.parseInt(args[0]);
		int trials=0,heads=0,tails=0;		
		for(int i=1;i<=number;i++)
		{ 
		trials++;
		if(Math.random()<0.5)			//using Math.random() function for checking heads
		{ heads++;
		System.out.println("Head");
		}
		else
			System.out.println("tail");
		}
		double Percentage=(heads*100)/trials;

		System.out.println("The no of heads="+heads+"\nThe percentage is "+Percentage);		

	}
}
	
