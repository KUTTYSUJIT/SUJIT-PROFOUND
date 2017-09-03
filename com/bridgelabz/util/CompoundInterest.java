/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CompoundInterest.java
 *  Execution:    java -cp bin com.bridgelabz.util.CompoundInterest
 *  
 *  Purpose: Determines the compound interest and returns the present value.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   20-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class CompoundInterest{
    public static double amount; 
    public static double rate; 
    public static double period; 
    public static double futureValue(double c,double r,double t)
    {
	double result=c/(Math.pow(1+r,t));
	return result;
    }
    public static void main(String args[])
    {
	double amount=Double.parseDouble(args[0]);
	double rate=Double.parseDouble(args[1]);
    	double period=Double.parseDouble(args[2]);
 	double value=futureValue(amount,rate,period);
	System.out.println("Future value="+value);   
    }
}