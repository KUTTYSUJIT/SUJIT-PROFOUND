/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Factorial.java
 *  Execution:    java -cp bin com.bridgelabz.util.Factorial
 *  
 *  Purpose: Determines the factorial of a given number.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class Factorial{
	public static int mUserInput;
	public static long factorial(int n)
	{   if(n==1)
	      return 1;
	    else
	      return (n*factorial(n-1));
	}
        public static void main(String args[])
	{
	 mUserInput=Integer.parseInt(args[0]);
	 long result=factorial(mUserInput);
	 System.out.print("Factorial of "+mUserInput+"="+result);
	  
	}
}