package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("number:");
		int a = scanner.nextInt();

		System.out.println("operation");
		char oper = scanner.next().charAt(0);
		System.out.println("another number");
		int b = scanner.nextInt();

		System.out.println(a);
		System.out.println(oper);
		System.out.println(b);

		if (oper == '+') {
			System.out.println("result is " + (a + b));
		} else if (oper == '-') {
			System.out.println("result is " + (a - b));
		} else if (oper == '*') {
			System.out.println("result is" + (a * b));

		} else if (oper == '/') {
			System.out.println("result is " + (a / b));

		} else if (oper == '^') {

			int res = 1;
			for (int i = 0; i < b; i++) {
				res *= a;
			}
			System.out.println(res);

		} else if (oper == '?') {

			int res = 1;

			if (a == 1 && b == 1) {

				res = a + b;
				System.out.println("result is " + res);
			} else {
				int facta = 1;
				for (; a > 1; a--) {
					facta *= a;
				}

				int factb = 1;
				for (; b > 1; b--) {
					factb *= b;
				}
				System.out.println("result is = " + facta + "+" + factb);

			}
		}

	}
}
