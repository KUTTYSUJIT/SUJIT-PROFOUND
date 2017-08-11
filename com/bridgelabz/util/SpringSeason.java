/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SpringSeason.java
 *  Execution:    java -cp bin com.bridgelabz.util.SpringSeason
 *  
 *  Purpose: Determines the spring season and displays true if months are between March and June otherwise prints false.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class SpringSeason { 
    public static void main(String[] args) { 
        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}