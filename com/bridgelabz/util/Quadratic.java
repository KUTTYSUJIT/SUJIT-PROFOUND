/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic
 *  
 *  Purpose: Determines the roots of quadratic equation by accepting the coefficients from user.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;
public class Quadratic
{
    public static void main(String[] args) 
      {
        int a, b, c;
        double root1, root2, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        
        System.out.print("Enter a:");		//Enter the coefficients a,b and c
        a = scanner.nextInt();
        System.out.print("Enter b:");
        b = scanner.nextInt();
        System.out.print("Enter c:");
        c = scanner.nextInt();
        
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        
	if(d > 0)							//checking if roots are real and unequal
        {
            System.out.println("Roots are real and unequal");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(d == 0)							//checking if roots are real and equal
        {
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("Roots are imaginary");		
         }
    }
}
