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
