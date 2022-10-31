package com.java.q1;

import java.util.Scanner;

public class Birthday {
	public static void main(String[] args) {
		
		System.out.println("Enter the Birthda Date : ");
		Scanner sc = new Scanner(System.in);
		/* scanner class to user enter the dates*/ 
		String c = sc.next();
		int birthDate = 2015/10/28;
		System.out.println(" Enter the today's date : ");
		String d=sc.next();
	    int  todayDate = 2022/10/27;
		
	    /*if else condition check data match or not*/
		if (todayDate==(2022/10/27))
		{
			System.out.println("Today is not my birthday");
		}
		else if(birthDate==(2015/10/28))
		{
			System.out.println("Happy Birthday");
			
		}
		
	}

}
