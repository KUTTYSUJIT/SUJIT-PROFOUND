/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
 *  Execution:    java -cp bin com.bridgelabz.util.CarLoan
 *  
 *  Purpose: Determines the car loan that calculates the monthly payment.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

class CarLoan{

	public static void main(String args[]){
		//acceptng the principle,year and rate from command line argument.

		double Principal=Double.parseDouble(args[0]);
		double Year=Double.parseDouble(args[1]);
		double Rate=Double.parseDouble(args[2]);
		
		//calculating the interest periods per year
		double n=12*Year;
		double rate=Rate/(12*100);
                double r=Math.pow(1+rate,n);

		
		//calculating the payment
		double Payment=(Principal*rate)/(1-1/r);

		System.out.println(Payment);
}
}	