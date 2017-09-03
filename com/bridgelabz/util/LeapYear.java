/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear
 *  
 *  Purpose: Determine whether the entered year is leap year or not.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class LeapYear { 
    public static void main(String[] args) { 
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0);

        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}
