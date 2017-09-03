/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Stats5.java
 *  Execution:    java -cp bin com.bridgelabz.util.Stats5 
 *  
 *  Purpose: To  prints five uniform random values between 0 and 1, their average value, and their minimum and maximum value.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.lang.Math;

public class Stats5 
{
    public static double mInputArray[]=new double[5];		//array to store five values
     
    public static void main(String[] args) 
    {
        for(int i=0;i<=4;i++)
        {
            mInputArray[i]=(Math.random());
        }
        
        System.out.println("The random values");
        for(int i=0;i<=4;i++)
        {
            
            System.out.println(mInputArray[i]);
        }
        System.out.println("The average value:"+(mInputArray[0]+mInputArray[1]+mInputArray[2]+mInputArray[3]+mInputArray[4])/5);
        System.out.println("The minimum value:"+(Math.min(mInputArray[0],Math.min(mInputArray[1],Math.min(mInputArray[2],Math.min(mInputArray[3],mInputArray[4]))))));
        System.out.println("The minimum value:"+(Math.max(mInputArray[0],Math.max(mInputArray[1],Math.max(mInputArray[2],Math.max(mInputArray[3],mInputArray[4]))))));
    }
}