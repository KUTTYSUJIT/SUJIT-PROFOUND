/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt
 *  
 *  Purpose: Determines the precedence of operators .
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class IntOpt {

    public static void main(String[] args) {
        
        //Taking three programs from command Line Argument
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int result1 = a + b*c;
        int result2 = a * b+c;
        int result3 = c + a/b;
        int result4 = a % b+c;

        System.out.println("Result1 = "+result1);
        System.out.println("Result2 = "+result2);
        System.out.println("Result3 = "+result3);
        System.out.println("Result4 = "+result4);

    }
}
