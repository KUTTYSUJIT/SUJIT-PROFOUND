/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNumber
 *  
 *  Purpose: Determines the Harmonic number that takes command line argument n.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class HarmonicNumber


{	public static void main(String[] args)


		{	System.out.println("Enter nuber of harmonics element you want\n");

			int number=Integer.parseInt(args[0]);
						
				int i=0;
				double sum=0;
				System.out.print("1/1");
				for(i=2;i<=number;i++)
				{
				   System.out.print("+1/"+i);
				}
				   System.out.println("\n");
				
				for(double g=1;g<=number;g++)
				{
				sum=sum+(double)Math.pow(g,-1);

						
               			}
				System.out.println(sum);
		}
}
