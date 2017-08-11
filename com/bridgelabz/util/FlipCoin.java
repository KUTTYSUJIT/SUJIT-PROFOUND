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
		if(Math.random()<0.5)			//using Math.random() function for checking heads
			System.out.println("Head");
		else
			System.out.println("tail");
	}
}
	