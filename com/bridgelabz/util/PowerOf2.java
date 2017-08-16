/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowerOf2
 *  
 *  Purpose: Determines the powers of 1-n numbers taking n from command line argument.
 *
 *  @since   16-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class PowerOf2{
     public static int mUserInput;		   //Variable for storing the value of n
     public static void main(String[] args)
     {    mUserInput=Integer.parseInt(args[0]);    //Accepting the decimal number from the user
	    
	  for(int i=0;i<=mUserInput;i++)
	  {
	   System.out.println(i+" "+(int) Math.pow(2,i));
	  }
}
}
	