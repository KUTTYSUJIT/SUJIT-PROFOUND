package com.bridgelabz.programs;

public class CalendarMonth {

	public static int day(int month,int day,int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + m * 31 / 12) % 7;
		return d0;
	}

	public static void main(String[] args) {

		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
        int d=day(month,1,year);
		int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)))
			months[2] = 29;
		
		for(int i=0;i<d;i++) {
			System.out.print("   ");
		}
		for(int i=1;i<=months[month];i++) {
			System.out.printf("%2d ",i);
			if(((i+d)%7==0) || (i==months[month]))
				System.out.println();
		}

	}
}