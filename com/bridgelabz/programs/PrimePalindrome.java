package com.bridgelabz.programs;

import com.bridgelabz.util.PrimeCheck;

public class PrimePalindrome {

	public static void main(String[] args) {
	
		int number=Integer.parseInt(args[0]);
		PrimeCheck pr=new PrimeCheck();
		pr.PrimeChecker(number);
	}

}
