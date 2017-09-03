/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill
 *  
 *  Purpose: Determines the Windchill by accepting temperature and wind speed from command line argument.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class WindChill
{
	public static void main(String args[])
	{
	   //Accepting temperature and Windspeed from command line argument

	   double Temperature=Double.parseDouble(args[0]);
	   
	   double WindSpeed=Double.parseDouble(args[1]);

	   //Calculating the windchill using the formula and Math.pow() function
           double windchill=35.74+0.6215*Temperature+(0.4275*Temperature-35.75)*Math.pow(WindSpeed,0.16);
	   
	   System.out.println("The entered temperature in Fahrenheit is"+Temperature+" \nThe entered wind speed is"+WindSpeed+"\nThe wind chill is"+windchill);	   
}
}		