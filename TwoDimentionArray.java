package com.bridgelab.day5.functional;

import java.util.Scanner;

public class TwoDimentionArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of Rows and Column");
		
		int[][] array =new int [sc.nextInt()][sc.nextInt()];
		System.out.println("Enter element of rows and colums");
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array[i].length; j++) { 
				array[i][j] = sc.nextInt(); 
			} 
		}


		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array[i].length; ++j) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}