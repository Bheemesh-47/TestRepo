package com.skilllync.programming_workshop.day1;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num)
	{
		boolean flag = true;
		for(int i=2;i<= num/2;i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	public static void main(String[] args) {
		//To collect input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked :");
		//the number to be checked is stored inside num
		int num = sc.nextInt();
		
		//calling isPrime(num) by passing num as the parameter
		boolean result = isPrime(num);
		if(result == true) 
		{
			System.out.println("Given Number is a Prime number");
		}
		else 
		{
			System.out.println("Given Number is not a Prime Number");
		}
	}
}
