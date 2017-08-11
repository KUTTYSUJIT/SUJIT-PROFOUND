/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfTwoDice
 *  
 *  Purpose: Determines the sum of two random integers between 1 and 6 when rolling a dice.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class SumOfTwoDice { 
    public static void main(String[] args) {
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
       
	System.out.println(a);
	System.out.println(b);
	System.out.println(sum);
    }
}
