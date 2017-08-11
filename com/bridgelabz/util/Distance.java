/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance
 *  
 *  Purpose: Determines the distance from point(x,y) from origin(0,0).
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Distance {
    public static void main(String[] args) {

        // parse x- and y-coordinates from command-line arguments
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        // compute distance to (0, 0)
        double dist = Math.pow((x*x + y*y),0.5);
 
        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }   
}