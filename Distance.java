package com.bridgelab.day5.functional;

import java.util.Scanner;

public class Distance {
	public double findDistance(int x, int y) {
		double distance = Math.sqrt((x * x) + (y * y));
		return distance;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x");
		int X = sc.nextInt();
		System.out.println("Enter value of y");
		int Y = sc.nextInt();
		Distance obj = new Distance();
		double distance = obj.findDistance(X, Y);
		System.out.println("Distance is of point from origin : " + distance);

	}

}
