/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion
 *  
 *  Purpose: conversion of temperature from fahrenheit to celcius and vice-versa
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;
public class TemperatureConversion
{		public static void main(String[] args)
		{	
			Scanner scanner=new Scanner(System.in);
			double fahrenheit,celcius;
			System.out.println("Enter your choice (f/c)");
			char choice=scanner.next().charAt(0);
			
			if(choice=='c')
			{  
			  System.out.println("Enter temperature in celcius");
			  celcius=scanner.nextDouble();

			  fahrenheit=32+(celcius*(9/5));
			  System.out.println("The converted temperature is "+fahrenheit);
			}
			
			else if(choice=='f')
			{  
			  System.out.println("Enter temperature in fahrenheit");
			  fahrenheit=scanner.nextDouble();

			  celcius=(fahrenheit*(5/9))-32;
			  System.out.println("The converted temperature is "+celcius);
			}
			else
			  System.out.println("Invalid input");
			
               }
}
