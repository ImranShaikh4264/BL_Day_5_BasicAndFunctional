package com.bridgelab.day5.functional;

import java.util.Scanner;

public class LargestOfThree {
	public int findLargest() {
		int largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt(); 
		System.out.println("Enter second number");
		int second=sc.nextInt(); 
		System.out.println("Enter third number");
		int third=sc.nextInt(); 
	if (first>second && first>third) {
		System.out.println("First number is Largest");
		largest=first;
	}
	else if (second>first && second>third) {
		largest=second;
	}
	else {
		largest=third;
	}
	return largest;
		
	}
	public static void main(String[] args) {
		LargestOfThree large = new LargestOfThree();
		int Largest=large.findLargest();
		System.out.println(Largest+" is the Largest number");
		
	}
}
