/******************************************************************************
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
import java.lang.Long;

import java.util.Scanner;
public class PrimeCheck   {
  public static void main(String args[]){
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the no to be checked for prime or not");
int i,counter=0;     
int PrimeNumber=scanner.nextInt();
for(i=2;i<=PrimeNumber/2;i++)
{
	if(PrimeNumber%i==0)
	{ counter++;
	}
}

if(counter<=1)
 System.out.println("The entered number "+PrimeNumber+"is Prime number");
else
System.out.println("Not a prime number");
}}
