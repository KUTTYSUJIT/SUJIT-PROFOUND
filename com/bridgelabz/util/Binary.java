/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Binary.java
 *  Execution:    java -cp bin com.bridgelabz.util.Binary
 *  
 *  Purpose: Determines the binary equivalent of decimal number from command line argument.
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   16-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Binary{
    public static int mDecimalNumber,mBinaryNumber=0;   //storing decimal number and binary equivalent
    public static int mRemainder,mTemporary,mBase=1;        //variables used for calculation
    
    public static void main(String[] args)
    {    mDecimalNumber=Integer.parseInt(args[0]);    //Accepting the decimal number from the user
	 mTemporary=mDecimalNumber;
	    
	    while(mTemporary!=0)
	    {  mRemainder=mTemporary%2;
	       mTemporary=mTemporary/2;
	       mBinaryNumber=mBinaryNumber+mRemainder*mBase;
	       mBase=mBase*10;
	    }
	 System.out.println(mBinaryNumber);
}
}
	