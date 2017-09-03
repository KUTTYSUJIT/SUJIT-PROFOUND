/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/MathFunctionPrime.java
 *  Execution:    java -cp bin com.bridgelabz.util.MathFunctionPrime
 *  
 *  Purpose: Determines whether the number is prime or not and returns a boolean value.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   19-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class MathFunctionPrime
{    public static int mUserInput;
     public static int mCount=0;
     public static boolean isPrime(int mUserInput)
     {   for(int i=1;i<=mUserInput;i++)
	 {
	   if(mUserInput%i==0)
	   { mCount++;
	   }
	 }
	   if (mCount==2)
	      return true;
	   else
	      return false;
     }
     public static void main(String args[])
     {
	mUserInput=Integer.parseInt(args[0]);
	boolean value=isPrime(mUserInput);
	System.out.print(value);
     }
}