package com.java.Interface;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime {
	
public static void main(String[] args)
{
   	LocalDate d = LocalDate.now();
   	LocalDate d1 =LocalDate.of(2015, Month.OCTOBER, 28);
   	Scanner sc = new Scanner(System.in);
   //	LocalDate a=d;
   	//LocalDate b=d1;
   	System.out.println("Enter the birthday date ");
   	String e=sc.next();
   	System.out.println("Enter the todaydate ");
   	int f=sc.nextInt();
//   	System.out.println(d);
//   	System.out.println(d1);
   	if(e==d1)
   	{
   		System.out.println("HAPPY BIRTHDAY..!!!");
   	}
   	else if(f==d)
   	{
   		System.out.println("Today is not your birthday..!");
   	}
}
}
