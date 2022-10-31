package com.java.ArrayTest;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		int c=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
			c++;
		{
			
		}
	}
	if(c==2)
	{
		System.out.println(i);
	}
}
}
}
