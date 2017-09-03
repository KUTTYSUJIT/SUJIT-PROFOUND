/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/sin.java
 *  Execution:    java -cp bin com.bridgelabz.util.sin 
 *  
 *  Purpose: To find sin of angle using Taylor series.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class sin {
    public static double term = 1.0;      // ith term = x^i / i!
    public static double sum  = 0.0;      // sum of first i terms in taylor series

    public static void main(String[] args) { 
        double x = Double.parseDouble(args[0]);

        x = x % (2 * Math.PI);		  // convert x to an angle between -2 PI and 2 PI
       
        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}
