package com.java.q1;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
	System.out.println("Enter the Birthda Date : ");
	/* scanner class to user enter the dates*/ 
	Scanner sc = new Scanner(System.in);
	String c = sc.next();
	System.out.println(" Enter the today's date : ");
	String d=sc.next();
	int birthDate=2015/10/28;
	int todayDate=2022/10/27;
	/* if condition to check the data, AND operation compare the dates*/
	if (birthDate==(2015/10/28) && todayDate==(2022/10/27))
	{
		System.out.println("HAPPY BIRTHDAY TO YOU...!!!!");
	}

}
}