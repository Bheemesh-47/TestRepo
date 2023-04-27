package com.skilllync.programming_workshop.day1;

import java.util.Scanner;

public class Factorial {
	static int num; //instance variables
	static int fact;//instance variables
	
	public static int factorial(int n)
	{
//		num = n;//5
//		fact = 1;
//		
//		for(int i=1;i<=num;i++)
//		{
//			fact = fact * i;//1, 2, 6, 24, 120
//		}
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		fact = factorial(num);
		System.out.println(fact);
	}
}
