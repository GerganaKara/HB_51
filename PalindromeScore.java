package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("number:");
		int a = scanner.nextInt();

		int score = 0;
		int a2 = a;
		int a1 = a;
		int rev = 0;
		int count = 1;
		
		while (true) {
			
			while (a != 0) {

				rev = rev * 10;
				rev = rev + a % 10;
				a = a / 10;
			}

			if (a1 == rev) {
				break;
			}

			a = rev + a1;
			rev = 0;
			a1 = a;
			count ++;
			
		}
		System.out.println("P(" + a2 + ") is " + count);

	}
}
