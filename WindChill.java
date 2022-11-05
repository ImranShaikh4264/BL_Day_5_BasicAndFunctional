package com.bridgelab.day5.functional;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		WindChill w = new WindChill();
		double temp=w.takeTemp();
		double velocity=w.takeVelocity();
		effectiveTemp(temp,velocity);
	}
	public double takeTemp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of temperature (upto 50 Farheneit ");
		int flag=0;
		double temp=0;
		while(flag==0) {
		double temp1 = sc.nextDouble();
		if (temp1<=50) {
		  temp=temp1;
		  flag=1;
		}
		else {
			System.out.println("Invalid temperature. Please enter temperature upto 50");
		}}
		return temp;
		
	}
	public double takeVelocity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of wind speed(Range 3-120) ");
		double velocity=0;
		int flag=0;
		while(flag==0) {
			double velocity1 = sc.nextDouble();
			if(velocity1>=3 && velocity1<=120) {
				velocity =velocity1;
				flag=1;
			}
			else {
				System.out.println("Invalid wind speed.Please enter speed in range(3-120)");
			}
		}
		
		return velocity;
		
	}
	public static void effectiveTemp(double temp,double velocity) {
		double t=temp;
		double v=velocity;
		double effective= 35.74+ 0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.160);
		System.out.println("Effective Temperature :" +effective);
	}

}
