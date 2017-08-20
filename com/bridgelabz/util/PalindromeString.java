/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PalindromeString.java
 *  Execution:    java -cp bin com.bridgelabz.util.PalindromeString
 *  
 *  Purpose: Determines the wins and percentage.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;
public class PalindromeString{
    public static char[] mInputString;
    public static char[] mSecondString;
    public static int mCounter=0;


    public static boolean palindrome(String userString)  
    {        char[] mInputString =userString.toCharArray();
	     int count=(mInputString.length)-1;

	    for(int i=0,j=count;i<mInputString.length && j>=0;i++,j--)
	    {  
		if(mInputString[j]==mInputString[i])
	           mCounter++;
            }
	    if(mCounter==mInputString.length)
               return true;
	    else 
	       return false;
	    

    }
    
public static void main(String[] args)
	{   Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the string");
	    String userInput=scanner.next();
	    boolean value=palindrome(userInput);

		System.out.println(value); 
	    

}


	
}