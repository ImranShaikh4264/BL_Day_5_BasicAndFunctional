package com.bridgelab.day5.functional;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of x");
		int x = sc.nextInt();
		System.out.println("Enter value of y");
		int y = sc.nextInt();
		double distance = Math.sqrt((x*x)+(y*y));
		System.out.println("Distance is : " +distance);
		
				
	}

}
