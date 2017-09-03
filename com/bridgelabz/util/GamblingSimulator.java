/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/GamblingSimulator.java
 *  Execution:    java -cp bin com.bridgelabz.util.GamblingSimulator
 *  
 *  Purpose: Determines the wins and percentage.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

class GamblingSimulator
{	
	static int goal,stake,trials;
	static int win=0;
	static int bet=0;
 	public static void main(String args[])
	{   
		stake=Integer.parseInt(args[0]);
	    	trials=Integer.parseInt(args[1]);
	    	goal=Integer.parseInt(args[2]);
	       	

	    	for(int i=0;i<=trials;i++)
	    	{
	     
	      	int cash=stake;
	      	while(cash>0 && cash<goal)
	      	{
		  bet++;
		if(Math.random()<0.5)
		  {
		    cash++;
		  }
		else
		  cash--;

	        }
		if(cash==goal)
		 win++;
  
		}
		System.out.println("bet percentage="+(bet*100)/trials);
		System.out.println("No of wins"+(win*100)/trials);
		
}
}

