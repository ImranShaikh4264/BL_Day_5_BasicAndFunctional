package com.bridgelab.day5.functional;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a*x^2 + b*x + c");
		System.out.println("Enter value of a:");
		double a =sc.nextDouble();
		System.out.println("Enter value of b:");
		double b =sc.nextDouble();
		System.out.println("Enter value of c:");
		double c =sc.nextDouble();
		double delta=((b*b)-(4*a*c));
		double root1 =(((-b)+Math.sqrt(delta))/(2*a));
		double root2 =(((-b)-Math.sqrt(delta))/(2*a));
		System.out.println("Root of x is "+root1+" and "+root2);
		
	}

}
