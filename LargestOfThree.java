package com.bridgelab.day5.functional;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int N1=sc.nextInt(); 
		System.out.println("Enter second number");
		int N2=sc.nextInt(); 
		System.out.println("Enter third number");
		int N3=sc.nextInt(); 
	if (N1>N2 && N1>N3) {
		System.out.println("First number is Largest");
	}
	else if (N2>N1 && N2>N3) {
		System.out.println("Second number is Largest");
	}
	else {
		System.out.println("Third number is Largest");
	}

	}
}
