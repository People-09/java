package com.java.ArrayTest;

import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args) {
	int  a[]=new int[6];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values");
	for(int i=0;i<5;i++) {
		a[i]=sc.nextInt();	
	}
	System.out.println("output");
	for(int i=0;i<6;i++)
	{
		System.out.println(a[i]);
	}
}
}
