package com.bridgelabz.util;
import java.lang.Long;
import java.util.Scanner;
class PrimePalindrome{
	public static void main(String args[])
	 
	{  Scanner scanner=new Scanner(System.in);
	   int counter=0;
	   for(long i=1;i<=100000;i++)
	   {
              for(long j=2;j<i;j++)
	      {
		if(i%j==0)
                    counter++;
	      }
	      if(counter<=1)
		{
		  System.out.println(i);
                }
              counter=0;
           }
}
}
	   
	
	   	
