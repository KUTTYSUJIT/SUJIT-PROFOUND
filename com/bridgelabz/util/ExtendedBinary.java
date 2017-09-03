/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/ExtendedBinary.java
 *  Execution:    java -cp bin com.bridgelabz.util.ExtendedBinary
 *  
 *  Purpose:Decimal2binary extende with following operation
 *          1-swap to nibbles
 *          2-concat nibbles and find result 
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   19-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

public class ExtendedBinary 
{
        public static int mDecimalNumber;	//user input decimal number
        public static int temp=0;		//temp count length of division on number

        public static int i=0;			//For increment of array
	public static int n1[]=new int[4];
        public static int n2[]=new int[4];
	public static int array[]=new int[8];		        //array to store bit value
         

        public static void main(String[] args) 
        {
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter decimal number:");
          mDecimalNumber=scanner.nextInt();
         
          //following is for storing nibble
          int a=0,b=0;
          while(mDecimalNumber>0)
          {
             array[i]=mDecimalNumber%2;
             mDecimalNumber/=2;
             temp++;
             i++;
          }
          array[i++]=0;
          temp++;
          for(i=temp-1;i>=0;i--)
          {
            if(i>3)
            {   n1[a]=array[i];
                a++;
            }
            else
            {  n2[b]=array[i];
               b++;
            }
            System.out.println(array[i]);
          }
           System.out.println(" resultant array after swapping nibble");
           for(int j=0;j<4;j++)
           {
               System.out.print(n2[j]);
           }

           for(int j=0;j<4;j++)
           {
               System.out.print(n1[j]);
           }
    }
}