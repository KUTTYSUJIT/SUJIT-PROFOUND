/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek
 *  
 *  Purpose: Determines the Day of the week that takes three command line arguments month,day and year.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class DayOfWeek
{
	public static void main(String args[])
	{
	 //Accepting the month from command line argument
	 int month=Integer.parseInt(args[0]);
         
 	 //Accepting day from command line argument
	 int day=Integer.parseInt(args[1]);

	 //Accepting the year from command line argument
         int year=Integer.parseInt(args[2]);
      
         //Calculation of year according to gregorian calendar
	 int y=year-(14-month)/12;

	 //Checking whether it is a leap year
	 int x=y+y/4-y/100+y/400;

	 //Calculation of month according to gregorian calendar
	 int m=month+12*((14-month)/12)-2;

	 //Calculation of year according to gregorian calendar
         int d=(day+x+m*31/12)%7;
  
	System.out.println(d);        
 }
	
}		