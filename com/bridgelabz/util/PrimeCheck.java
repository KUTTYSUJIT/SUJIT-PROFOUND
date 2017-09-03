<<<<<<< HEAD
package com.bridgelabz.util;

public class PrimeCheck {

	public void PrimeChecker(int PrimeNumber) {
		System.out.println(1);
		for (int i = 2; i <= PrimeNumber; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					flag++;
			}
			if (flag == 0) {
				int temp = 0;
				int reverse = 0;
				temp=i;
				while (temp != 0) {
					reverse = reverse * 10;
					reverse = reverse + temp % 10;
					temp = temp / 10;
				}
				if (i == reverse)
					System.out.println(i);
			
			}
		}
	}
}
=======
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
>>>>>>> c67d8096e61eb07632874087a8fa9d21cba0ac5e
