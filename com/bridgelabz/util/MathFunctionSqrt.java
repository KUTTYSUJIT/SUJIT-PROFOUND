/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/MathFunctionSqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.MathFunctionSqrt
 *  
 *  Purpose: Computes the square root of a nonnegative number c using Newton's method and using Math.sqrt().
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   19-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class MathFunctionSqrt
 { 
    public static double sqrt(double c)
    {
      return (Math.sqrt(c));
    }
    public static double sqrt(double c,double epsilon)
    {   double t = c;
	while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }
	return t;
    }
        
    public static void main(String[] args)
    { 
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;               // relative error tolerance 
        double result=sqrt(c);
        double result2=sqrt(c,epsilon);
         System.out.println("Result1="+result+"\nResult2="+result2);
    }

}