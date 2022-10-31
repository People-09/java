package com.java.ArrayTest;

import java.util.Scanner;

public class TestPrime {
public static void main(String[] args) {
	int n,i,tea=0,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	 n =sc.nextInt();
	for(i=2;i<n-1;i++)
	{
		if(n%i==0)
		{
			tea=1;
			break;
		}
	}
	if(tea==1)
	{
		System.out.println("this is not prime number");
	}
	else
	{
		System.out.println("this is prime number");
	}
}
}
