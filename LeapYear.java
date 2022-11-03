package com.bridgelab.day5.functional;

import java.util.Scanner;

public class LeapYear {
	public void checkLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year +" is a leap year.");
		} 
		else if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} 
		else {
			System.out.println(year + " is not leap year");
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year ");
		int year = sc.nextInt();
		LeapYear obj = new LeapYear();
		obj.checkLeapYear(year);
	}
}
