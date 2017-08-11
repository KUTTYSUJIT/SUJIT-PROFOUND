/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DoubleOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.DoubleOpt
 *  
 *  Purpose: Determines the precedence of operators using double datatype.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class DoubleOpt { 

    public static void main(String[] args) {
      
	//Acccepting three inputs from command line argument
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	
      
        double result1 = a + b*c;
        double result2 = a * b+c;
        double result3 = c + a/b;
        double result4 = a % b+c;

        System.out.println("Result1 = "+result1);
        System.out.println("Result2 = "+result2);
        System.out.println("Result3 = "+result3);
        System.out.println("Result4 = "+result4);


    }
}
