package com.skilllync.programming_workshop.day1;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static int sumUsingLoop(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	public static int sumUsingRecursion(int n)
	{
		if(n!=0)
			return n + sumUsingRecursion(n-1);
		else
			return n;
	}
	public static int sumUsingAP(int a, int d, int n)
	{
		int cur_ele = a;//1
		int sum = 0;
		
		for(int i=1;i<=n;i++)
		{
			sum = sum + cur_ele;//0+1=1-->1+2=3
			cur_ele= cur_ele+d;//1+1=2,3
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if(num>0) {
//			int result = sumUsingLoop(num);
//			System.out.println(result);
//			int result = sumUsingRecursion(num);
//			System.out.println(result);
			int result = sumUsingAP(1,1,num);
			System.out.println(result);
		}
		else {
			System.out.println("Given Number is not a natural number");
		}
	}
}
