package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("number:");
	    int a = scanner.nextInt();
	    
	    int rev = 0;
	    int a1 = a;
	    
	    while ( a != 0){
	    	
	    	rev = rev *10;
	    	rev = rev + a%10;
	    	a = a/10;
	    }
	    
	    System.out.println("Your number is "+ a1 + " and its revers is " + rev);
	    int sum = a1 + rev;
	    
	    int sum1 = sum;
	    int revsum = 0;
	    
	    while ( sum != 0){
	    	
	    	revsum = revsum * 10;
	    	revsum = revsum + sum%10;
	    	sum = sum/10;
	    }
	    
	    if (sum1 == revsum){
	    	System.out.println("Numbers are palindromes");
	    } else {
	    	System.out.println("Numbers are not palindromes");
	    }
	    
	}
	
	
}
