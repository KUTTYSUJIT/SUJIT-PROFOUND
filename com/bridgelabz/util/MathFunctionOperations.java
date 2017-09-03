/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/MathFunctionOperations.java
 *  Execution:    java -cp bin com.bridgelabz.util.MathFunctionOperations
 *  
 *  Purpose: Determines mathematical operations of given value using static functions.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   19-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class MathFunctionOperations{
     public static double mUserInput; 				//static variable for storing user input 
     public static int mUserInputInteger;
     public static double mSumOfSeries;
     public static int mRemainder=0,mTemporary,mBase=1,mBinaryNumber=0;
     public static double sum;
     public static double term = 1.0;
     public static double harmonicNumber(double number)
     {
	for(double g=1;g<=number;g++)
	{   sum=sum+(double)Math.pow(g,-1);
        }
        return sum;
     }
     public static double sin(double x)
     {
	x = x % (2 * Math.PI);		  // convert x to an angle between -2 PI and 2 PI
       
        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) mSumOfSeries += term;
            if (i % 4 == 3) mSumOfSeries -= term;
        }
	return mSumOfSeries;
     }
     public static int binary(int decimal)
     {
	mTemporary=decimal;
	    
	    while(mTemporary!=0)
	    {  mRemainder=mTemporary%2;
	       mTemporary=mTemporary/2;
	       mBinaryNumber=mBinaryNumber+mRemainder*mBase;
	       mBase=mBase*10;
	    }
	 return mBinaryNumber;
     }
     public static void main(String args[])
     {  Scanner scanner=new Scanner(System.in);
	mUserInput=scanner.nextDouble();
	mUserInputInteger=scanner.nextInt();
	double result1=harmonicNumber(mUserInput);
	double result2=sin(mUserInput);
     	int result3=binary(mUserInputInteger);
     	System.out.println(result1+"\n"+result2+"\n"+result3);
     }
 }