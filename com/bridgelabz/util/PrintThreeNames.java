/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames
 *  
 *  Purpose: Accepting strings from command line argument and displaying it in reverse order .
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;
public class PrintThreeNames
{	static String[] array=new String[3];
	public static void main(String[] args)
	{
	   
	  for(int i=0;i<args.length;i++)
	  {
	    array[i]=args[i];
	  }
	  for(int i=args.length-1;i>=0;i--)
	  {
	   System.out.print(" HI "+array[i]);
	  }
}
}
	
	  