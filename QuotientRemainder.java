package com.bridgelab.day5.functional;

import java.util.Scanner;

public class QuotientRemainder {
public static void calculate(int num,int div) {
	int number = num;
	int divider =div;
	int remainder =number%divider;
	int quetient=(number-remainder)/divider;
	System.out.println("Quoient is : "+quetient+ "  Remainder is : " +remainder);
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number which is to be divided");
	int number = sc.nextInt();
	System.out.println("Enter Divider");
	int divider = sc.nextInt();
	calculate(number,divider);
}
}
