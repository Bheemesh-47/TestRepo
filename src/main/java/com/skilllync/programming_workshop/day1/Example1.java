package com.skilllync.programming_workshop.day1;

import java.util.Scanner;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        System.out.println("Enter the elements for an array");
       
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
       
        System.out.print("Your inserted array is  : { ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
       
        int arr2[] = new int[arr.length];
       
        for(int i = 0 ; i < arr.length ; i++)
        {
            boolean yesOrNo = true;
           
            for(int k = 0 ; k < arr2.length ; k++)
            {
                if(arr[i] == arr2[k])
                {
                    yesOrNo = false;
                }
            }
            if(yesOrNo)
            {
                int count = 1;
                for(int j = i+1 ; j < arr.length ; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }
               
                System.out.println(arr[i] + " occurs " + count + " times. ");
            }
           
            if(arr[i] != arr2[i])
            {
                arr2[i] = arr[i];
            }
        }
       
        sc.close();
    }
}