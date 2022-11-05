package com.bridgelab.day5.functional;

import java.util.Scanner;

public class VowelOrConsonentSwich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabate");
	 String Alphabate = sc.nextLine();
     switch (Alphabate) {
         case "a":
             System.out.println("Alphabata is Vowel");
             break;
         case "e":
             System.out.println("Alphabata is Vowel");
             break;
         case "i":
             System.out.println("Alphabata is Vowel");
             break;
         case "o":
             System.out.println("Alphabata is Vowel");
             break;
         case "u":
             System.out.println("Alphabata is Vowel");
             break;
         default:
             System.out.println("Alphabate is consonents");    
     }
	}
}
