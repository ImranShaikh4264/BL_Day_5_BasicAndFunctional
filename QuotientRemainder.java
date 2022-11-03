package com.bridgelab.day5.functional;

import java.util.Scanner;

public class QuotientRemainder {
public static void calculate(int number,int divider) {
	int N = number;
	int D =divider;
	int R =N%D;
	int Q=(N-R)/D;
	System.out.println("Quoient is : "+Q+ "  Remainder is : " +R);
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
