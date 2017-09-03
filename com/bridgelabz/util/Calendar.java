/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Calendar.java
 *  Execution:    java -cp bin com.bridgelabz.util.Calendar
 *  
 *  Purpose: Determines the Day of the week that takes three command line arguments month,day and year.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   20-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Calendar
{
        public static String DayOfWeek(int year,int month,int day)	
	{
	 int y=year-(14-month)/12;

         int x=y+y/4-y/100+y/400;

	 int m=month+12*((14-month)/12)-2;

	 int d=(day+x+m*31/12)%7;
	 if(d==0)
             return "Sunday";
         else if(d==1)
             return "Monday";
         else if(d==2)
             return "Tuesday";
         else if(d==3)
             return "Wednesday";
         else if(d==4)
             return "Thurday";
         else if(d==5)
             return "Friday";
         else
             return "Saturday";
         
	}
	public static void main(String args[])
	{
	 int month=Integer.parseInt(args[0]);
         
 	 int day=Integer.parseInt(args[1]);

         int year=Integer.parseInt(args[2]);
      
	 String result=DayOfWeek(year,month,day);	   
	System.out.println("It is "+result);        
 }
	
}		