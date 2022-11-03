package com.bridgelab.day5.functional;

import java.util.Scanner;

public class PrimeFactor {
	public static void primeFactor(int Number) {
		int N = Number;
		for (int i =2; i<= N;i++) {
			while(N%i==0) {
				System.out.println(i);
				N=N/i;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int Number = sc.nextInt();
		primeFactor(Number);
	}

}
