package com.bridgelab.day5.functional;

import java.util.Scanner;

public class Distance {
	public double findDistance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x");
		int x = sc.nextInt();
		System.out.println("Enter value of y");
		int y = sc.nextInt();
		double distance = Math.sqrt((x * x) + (y * y));
		return distance;

	}

	public static void main(String[] args) {
		
		Distance obj = new Distance();
		double distance = obj.findDistance();
		System.out.println("Distance is of point from origin : " + distance);

	}

}
